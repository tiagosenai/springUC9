package br.edu.senai.springUC9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.senai.springUC9.services.CategoriaServico;

@Controller
public class SpringUC9Controller {
	@Autowired
	private CategoriaServico servico;
	
	@GetMapping({"/"})
	public String path() {
        return "index";
    }
	
	@GetMapping({"/categorias"})
	public String listarCategorias(Model modelo) {
        modelo.addAttribute("categoria", servico.listarCategorias());
		return "categorias";
    }
}
