package com.smail.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeneratorApplication {

	public static void main(String[] args) {

		GeneratorRun generatorRun=new GeneratorRun();

		try {
			generatorRun.GeneratorRun();
		} catch (Exception e) {
			e.printStackTrace();
		}
		SpringApplication.run(GeneratorApplication.class, args);
	}
}
