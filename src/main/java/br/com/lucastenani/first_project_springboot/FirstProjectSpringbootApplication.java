package br.com.lucastenani.first_project_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.lucastenani")
public class FirstProjectSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectSpringbootApplication.class, args);
	}

}
