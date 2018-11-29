package com.amp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/messsage")
	public String home() {
		return "Hello Phenix";
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Hello Phenix");
//	}
}
