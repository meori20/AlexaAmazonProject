package alexa.rest.service.controllers.interfaces;

import org.springframework.web.bind.annotation.RequestParam;

import alexa.rest.service.exe.impel.Greeting;

public interface IGreetingController {
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name);
}
