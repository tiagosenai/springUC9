package br.edu.senai.springUC9.services;

import java.util.List;

import br.edu.senai.springUC9.orm.Categoria;

public interface CategoriaServico {
	public List<Categoria> listarCategorias();
	
	public Categoria salvarCategorias(Categoria categoria);
}
