package alexa.rest.service.controllers.impel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.ch.api.mobile.VideoSession;

import alexa.rest.service.delegates.impel.StratVideoStreamingDelegate;
import alexa.rest.service.delegates.interfaces.IStartVideoStreamingDelegate;
import alexa.rest.service.interfaces.impel.IStartVideoStreamController;

@RestController
public class StartVideoStreamController implements IStartVideoStreamController {
    
	
	@Override
    @RequestMapping("/startVideoStream")
    public VideoSession startVideoStream(@RequestParam(value="videoId", defaultValue="1") long name) {
		IStartVideoStreamingDelegate delegate = new StratVideoStreamingDelegate();
		return delegate.GetVideoStream();
		
    }
}
