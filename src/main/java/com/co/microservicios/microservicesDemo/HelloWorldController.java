package com.co.microservicios.microservicesDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HelloWorldController   


{  

	@Value("${spring.application.name}")
	private String name;	


	@GetMapping("/hola")  
	public String hello()   
	{  
		return "Hello andy:" +this.name;  
	}  


}  