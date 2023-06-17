package com.programando.elevadoquadrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/numero")
public class ElevadoQuadradoApplication {
	@GetMapping("/{numero}")
	public int elevadoAoQuadrado(@PathVariable int numero){
		return numero *  numero;
	}
	public static void main(String[] args) {
		SpringApplication.run(ElevadoQuadradoApplication.class, args);
	}
}
