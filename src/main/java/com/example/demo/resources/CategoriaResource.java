package com.example.demo.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Categoria;
import com.example.demo.domain.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias") //indicando o endpoint
public class CategoriaResource {
	
	@Autowired //instancia automaticamente
	private CategoriaService service;
	
	
// A partir de agora o ENDPOINT desta seção dentro de /categoria será /id = categoria/id	
	@RequestMapping(value="/{id}", method=RequestMethod.GET) 
	public ResponseEntity<?> find(@PathVariable Integer id) { //Essa anotação indica que a ID do método vai ir pra ID da variavel /id | RespondeEntity armazena diversas informações para uma resposta HTTP REST
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj); //Vai buscar por ID e retornar um OK no modelo REST, o corpo do obj
		
	}

}
