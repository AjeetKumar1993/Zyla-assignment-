package com.zyla.health;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zyla.health.controller"})
public class ZylaHealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZylaHealthApplication.class, args);
		System.out.println("Successzfully started");
	}
}
