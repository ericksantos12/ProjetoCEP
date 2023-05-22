package edu.fateczs.cep_nota_consulta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class CepNotaConsultaApplication {

	@GetMapping("/")
	public String index(){
		return "index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(CepNotaConsultaApplication.class, args);
	}

}