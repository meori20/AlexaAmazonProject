package alexa.project.api.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.ch.api.mobile.VideoSession;

import alexa.project.api.service.delegate.impel.StratVideoStreamingDelegate;
import alexa.project.api.service.delegate.interfaces.IStartVideoStreamingDelegate;

import java.security.Principal;

@RestController
@RequestMapping("/rest")
public class StartVideoStreamController {


    @GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }
    
    @GetMapping("/startVideoStream")
    public VideoSession startVideoStream(@RequestParam(value="videoId", defaultValue="1") long name) {
		IStartVideoStreamingDelegate delegate = new StratVideoStreamingDelegate();
		return delegate.GetVideoStream();
		
    }

}
