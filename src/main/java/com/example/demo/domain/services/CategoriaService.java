
package com.example.demo.domain.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.Categoria;
import com.example.demo.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não Encontrado! ID: " + id + ", TIPO: " + Categoria.class.getName(), null));
	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	/*
	 * public Categoria update(Categoria obj) { Categoria newObj =
	 * find(obj.getId()); updateData(newObj, obj); return repo.save(newObj); }
	 * 
	 * public void delete(Integer id) { find(id); try { repo.deleteById(id); } catch
	 * (DataIntegrityViolationException e) { throw new
	 * DataIntegrityException("Não é possível excluir uma categoria que possui produtos"
	 * ); } }
	 * 
	 * public List<Categoria> findAll() { return repo.findAll(); }
	 * 
	 * public Page<Categoria> findPage(Integer page, Integer linesPerPage, String
	 * orderBy, String direction) { PageRequest pageRequest = PageRequest.of(page,
	 * linesPerPage, Direction.valueOf(direction), orderBy); return
	 * repo.findAll(pageRequest); }
	 * 
	 * public Categoria fromDTO(CategoriaDTO objDto) { return new
	 * Categoria(objDto.getId(), objDto.getNome()); }
	 * 
	 * private void updateData(Categoria newObj, Categoria obj) {
	 * newObj.setNome(obj.getNome()); }
	 */
}
