package alexa.rest.service.delegates.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amdocs.ch.api.mobile.MobileHomeServiceProxy;
import com.amdocs.ch.api.mobile.MobileHomeService_PortType;

@Configuration
public class DelegatesBeansConfig {
	
	@Bean
	public MobileHomeService_PortType mobileHomeServiceProxy(){
		return new MobileHomeServiceProxy();
	}
}
