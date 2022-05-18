package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		if(args.length == 1 && "-v".equals(args[0])){
			BuildTimeReader.printBuildTime(args);
			return;
		}
		SpringApplication.run(DemoApplication.class, args);
	}

}
