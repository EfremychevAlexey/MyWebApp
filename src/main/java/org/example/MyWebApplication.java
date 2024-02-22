package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MyWebApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder
	configure(SpringApplicationBuilder application){
		return application.sources(
				MyWebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MyWebApplication.class, args);
	}
}
