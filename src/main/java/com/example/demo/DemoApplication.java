package com.example.demo;

import com.example.demo.Entity.ParcJardin;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {


		ParcJardin pj1= new ParcJardin("Parc1","Desc1","PARC","30.1","3.2","Adress1");
System.out.println(pj1.toString());
	}
}
