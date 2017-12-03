package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushController {


    @RequestMapping("/push")
    public Push push(@RequestParam(value="name") String name) {
    	
    	
		return new Push(name);
        
    }
}