package com.CursoMSA.DESTINATARIO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DestinatarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DestinatarioApplication.class, args);
	}

}
