package alexa.rest.service.interfaces.impel;

import org.springframework.web.bind.annotation.RequestParam;

import alexa.rest.service.delegates.interfaces.IStartVideoStreamingDelegate;

public interface IStartVideoStreamController {

	public IStartVideoStreamingDelegate startVideoStream(@RequestParam(value="videoId", defaultValue="1") long name) ;

}
