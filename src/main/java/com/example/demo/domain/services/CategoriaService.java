
package com.example.demo.domain.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
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
		return obj.orElseThrow(() -> new ObjectNotFoundException( //Tratamento de erro caso busque uma categoria que não existe e evitar o envio de "ok"
				"Objeto não Encontrado! ID: " + id + ", TIPO: " + Categoria.class.getName(), null));
		
	}

}
