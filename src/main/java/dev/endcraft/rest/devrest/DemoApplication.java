package dev.endcraft.rest.devrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import dev.endcraft.rest.devrest.cont.MainController;


@SpringBootApplication
@ComponentScan(basePackageClasses = MainController.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
