package com.example.demo.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello From Command Line Runner");
	}

}
