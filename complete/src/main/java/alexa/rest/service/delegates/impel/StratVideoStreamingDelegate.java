package alexa.rest.service.delegates.impel;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.springframework.stereotype.Component;

import com.amdocs.ch.api.mobile.MobileHomeService_PortType;
import com.amdocs.ch.api.mobile.MobileHomeService_ServiceLocator;
import com.amdocs.ch.api.mobile.VideoSession;
import com.amdocs.ch.publicapi.service.AuthenticationResponse;
import com.amdocs.ch.publicapi.service.AuthenticationServiceProxy;

import org.apache.axis.client.Stub;


import alexa.rest.service.delegates.interfaces.IStartVideoStreamingDelegate;

@Component
public class StratVideoStreamingDelegate implements IStartVideoStreamingDelegate {

	
	private AuthenticationServiceProxy m_AuthenticationServiceProxy;
	
	private MobileHomeService_ServiceLocator m_MobileHomeService_ServiceLocator;
	
	public StratVideoStreamingDelegate() {
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
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		
		return videoSession;
	}
	
}
