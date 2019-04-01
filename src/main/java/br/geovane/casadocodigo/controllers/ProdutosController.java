package br.geovane.casadocodigo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.geovane.casadocodigo.models.Produto;

@Controller
public class ProdutosController {

	@RequestMapping("/produtos/form")
	public String form() {
		return "produtos/form";
	}

	@RequestMapping("/produtos")
	public String grava(Produto produto) {
		System.out.println(produto);
		
		return "produtos/ok";
	}
}
