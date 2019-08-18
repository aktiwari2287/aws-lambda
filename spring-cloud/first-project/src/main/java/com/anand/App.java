package com.anand;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

	@Bean
	public Supplier<String> supply(){
		return ()->"Hello";
	}
	
	@Bean
	public Consumer<String> consume(){
		return input->{
			System.out.println("Hii , "+input);
		};
	}
	 
	
	public static void main(String[] args) {

		SpringApplication.run(App.class, args);
	}

}
