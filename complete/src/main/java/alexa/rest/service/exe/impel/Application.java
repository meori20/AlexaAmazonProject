package alexa.rest.service.exe.impel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import alexa.rest.service.exe.interfaces.IApplication;

@SpringBootApplication
public class Application implements IApplication {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
