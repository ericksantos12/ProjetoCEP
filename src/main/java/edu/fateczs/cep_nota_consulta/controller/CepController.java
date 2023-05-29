package edu.fateczs.cep_nota_consulta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.fateczs.cep_nota_consulta.CepForms;
import edu.fateczs.cep_nota_consulta.service.ApiService;

@Controller
public class CepController {
	private ApiService apiService;

	public CepController(ApiService apiService) {
		this.apiService = apiService;
	}

    @GetMapping("/")
	public String index(){
		return "index";
	}

	@GetMapping("/notas")
	public String notas(){
		return "notas";
	}

	@GetMapping("/cep")
	public String cep(ModelMap model){
		model.addAttribute("cepObjeto", new CepObjeto());
		return "cep";
	}
	@PostMapping("/cep")
	public String cep(@ModelAttribute CepForms cepForms, ModelMap model){
		String request = apiService.fazerRequisicaoCEP(cepForms.getCep());
		model.addAttribute("request", request);
		return "cep";
	}

}
