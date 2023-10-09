package br.edu.senai.springUC9.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.senai.springUC9.orm.Categoria;
import br.edu.senai.springUC9.repository.CategoriaRepository;

@Service
public class CategoriaServicoCRUD implements CategoriaServico{
	@Autowired
	private CategoriaRepository repositorio;
	
	public List<Categoria> listarCategorias(){
		return (List<Categoria>)repositorio.findAll();
	}
	
	public Categoria salvarCategorias(Categoria categoria) {
		return repositorio.save(categoria);
	}
	
	public void apagarCategoria(Integer id) {
		repositorio.deleteById(id);
	}
	
	public Categoria consultarCategoriasId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public Categoria atualizarCategorias(Categoria categoria) {
		return repositorio.save(categoria);
	}
}
