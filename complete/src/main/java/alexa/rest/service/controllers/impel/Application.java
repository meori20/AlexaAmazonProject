package alexa.rest.service.controllers.impel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import alexa.rest.service.controllers.interfaces.IApplication;


@SpringBootApplication
public class Application implements IApplication {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
