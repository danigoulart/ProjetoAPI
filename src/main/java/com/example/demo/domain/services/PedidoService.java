
package com.example.demo.domain.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Pedido;
import com.example.demo.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired 
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id); 											
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
				"Objeto não Encontrado! ID: " + id + ", TIPO: " + Pedido.class.getName(), null));
		
	}

}
