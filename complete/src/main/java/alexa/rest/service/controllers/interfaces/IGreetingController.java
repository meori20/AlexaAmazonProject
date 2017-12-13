package alexa.rest.service.controllers.interfaces;

import org.springframework.web.bind.annotation.RequestParam;

import alexa.rest.service.delegates.impel.GreetingDelegate;


public interface IGreetingController {
	public GreetingDelegate greeting(@RequestParam(value="name", defaultValue="World") String name);
}
