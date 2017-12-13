package alexa.rest.service.controllers.impel;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import alexa.rest.service.controllers.interfaces.IGreetingController;
import alexa.rest.service.delegates.impel.GreetingDelegate;

@RestController
public class GreetingController implements IGreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    @RequestMapping("/greeting")
    public GreetingDelegate greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new GreetingDelegate(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
