package alexa.rest.service.interfaces.impel;

import org.springframework.web.bind.annotation.RequestParam;

import com.amdocs.ch.api.mobile.VideoSession;

import alexa.rest.service.delegates.interfaces.IStartVideoStreamingDelegate;

public interface IStartVideoStreamController {

	public VideoSession startVideoStream(@RequestParam(value="videoId", defaultValue="1") long name) ;

}
