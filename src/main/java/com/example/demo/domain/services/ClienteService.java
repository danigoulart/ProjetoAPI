
package com.example.demo.domain.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Cliente;
import com.example.demo.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired 
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id); 											
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
				"Objeto não Encontrado! ID: " + id + ", TIPO: " + Cliente.class.getName(), null));
		
	}

}
