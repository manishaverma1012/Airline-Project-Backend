package com.lti.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
public class ProjectGladiatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectGladiatorApplication.class, args);
	}
	@SuppressWarnings("deprecation")
    @Bean
    public WebMvcConfigurer corsConfigurer() {
          return new WebMvcConfigurerAdapter() {
        	  @Override
              public void addCorsMappings(CorsRegistry registry) {
                 registry.addMapping("/rest/api/userdetails").allowedOrigins("http://localhost:4200");//look for this error
                 
              }
        	  
		}; 
             
          
       }
}