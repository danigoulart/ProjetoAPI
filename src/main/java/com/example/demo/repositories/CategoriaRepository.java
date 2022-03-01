package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Categoria;

@Repository //Anotação que indica que esta camada se trata de um Repository
//JPA repository disponiliza diversas opções para serem usadas
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}