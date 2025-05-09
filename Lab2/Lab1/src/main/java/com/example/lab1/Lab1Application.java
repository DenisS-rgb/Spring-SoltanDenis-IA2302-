package com.example.lab1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")  // importă configurările XML
public class Lab1Application {

	public static void main(String[] args) {
		// Pornește aplicația Spring Boot și încarcă contextul (config Java + XML)
		ApplicationContext context = SpringApplication.run(Lab1Application.class, args);

		// Obține bean-urile după nume (pentru a distinge între cele două configurații)
		Customer customerFromJavaConfig = context.getBean("customerJavaBean", Customer.class);
		Customer customerFromXmlConfig  = context.getBean("customerXmlBean", Customer.class);

		// Demonstrație: afișăm bean-urile obținute, evidențiind că dependențele au fost injectate
		System.out.println("Bean din Java config: " + customerFromJavaConfig);
		System.out.println("Bean din XML config: " + customerFromXmlConfig);
	}
}
