package alexa.rest.service.delegates.impel;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amdocs.ch.api.mobile.MobileHomeServiceProxy;
import com.amdocs.ch.api.mobile.MobileHomeService_PortType;
import com.amdocs.ch.api.mobile.MobileHomeService_ServiceLocator;
import com.amdocs.ch.api.mobile.VideoSession;
import com.amdocs.ch.publicapi.service.AuthenticationResponse;
import com.amdocs.ch.publicapi.service.AuthenticationServiceProxy;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;

import org.apache.axis.client.Stub;
import org.apache.axis.client.Call;


import alexa.rest.service.delegates.interfaces.IStartVideoStreamingDelegate;

@Component
public class StratVideoStreamingDelegate implements IStartVideoStreamingDelegate {

	private MobileHomeServiceProxy m_MobileHomeServiceProxy;
	
	private AuthenticationServiceProxy m_AuthenticationServiceProxy;
	
	private MobileHomeService_ServiceLocator m_MobileHomeService_ServiceLocator;
	
	public StratVideoStreamingDelegate() {
		m_MobileHomeServiceProxy = new MobileHomeServiceProxy();
		m_AuthenticationServiceProxy = new AuthenticationServiceProxy();
	}
	
	@Override
	public VideoSession GetVideoStream() {
		VideoSession videoSession = null;
		try {
			AuthenticationResponse respones = m_AuthenticationServiceProxy.authenticate("PM360DX1", "Password1");
			
			
			m_MobileHomeService_ServiceLocator = new MobileHomeService_ServiceLocator();
			
			MobileHomeService_PortType client = m_MobileHomeService_ServiceLocator.getMobileHomeServicePort();
			((Stub) client)._setProperty(javax.xml.rpc.Call.USERNAME_PROPERTY, "PM360DX1");
			((Stub) client)._setProperty(javax.xml.rpc.Call.PASSWORD_PROPERTY, respones.getAuthenticationDetails().getSecurityToken());
			videoSession = client.startVideoStreaming(218201,null);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return videoSession;
	}
	
}
