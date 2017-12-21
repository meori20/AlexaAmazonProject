package alexa.rest.service.delegates.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amdocs.ch.api.mobile.MobileHomeServiceProxy;
import com.amdocs.ch.api.mobile.MobileHomeService_PortType;
import com.amdocs.ch.publicapi.service.AuthenticationServiceProxy;
import com.amdocs.ch.publicapi.service.AuthenticationService_PortType;

@Configuration
public class DelegatesBeansConfig {
	
	@Bean
	public MobileHomeService_PortType mobileHomeServiceProxy(){
		return new MobileHomeServiceProxy();
	}
	
	@Bean
	public AuthenticationService_PortType authenticationService() {
		return new AuthenticationServiceProxy();
	}
}
