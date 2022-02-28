
package com.example.demo.domain.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Categoria;
import com.example.demo.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired // instancia o objeto automaticamente
	private CategoriaRepository repo;

	// passando o parametro pra ser realizado a busca atraves do tipo
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id); // vai buscar na Categoria (repository) um obj pelo seu número de												// ID e retornar ele pelo seu valor PRONTO
		return obj.orElse(null);
	}

}
