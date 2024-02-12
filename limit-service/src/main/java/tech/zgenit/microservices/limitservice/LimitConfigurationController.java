package tech.zgenit.microservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.zgenit.microservices.limitservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController{
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}