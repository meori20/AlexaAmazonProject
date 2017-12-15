package alexa.rest.service.delegates.impel;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amdocs.ch.api.mobile.MobileHomeServiceProxy;
import com.amdocs.ch.api.mobile.VideoSession;

import alexa.rest.service.delegates.interfaces.IStartVideoStreamingDelegate;

@Component
public class StratVideoStreamingDelegate implements IStartVideoStreamingDelegate {

	@Autowired
	private MobileHomeServiceProxy m_MobileHomeServiceProxy;

	@Override
	public VideoSession GetVideoStream() {
		
		try {
			m_MobileHomeServiceProxy.startVideoStreaming(1000, null);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
}
