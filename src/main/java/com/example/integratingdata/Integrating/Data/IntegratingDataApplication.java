package com.example.integratingdata.Integrating.Data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;


@SpringBootApplication
@ImportResource("/integration/integration.xml")
public class IntegratingDataApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext ctx = new
				SpringApplication(IntegratingDataApplication.class).run(args);
		System.out.println("Hit Enter to terminate");
		System.in.read();
		ctx.close();
	}

}
