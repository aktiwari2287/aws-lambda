package com.anand;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class Hello implements Function<String,String>{

	public String apply(String t) {
		System.out.println("Hi..........."+t);
		return "Hello, "+ t;
	}

}
