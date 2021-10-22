package com.pamellagodoi.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pamellagodoi.cursomc.domain.Categoria;
import com.pamellagodoi.cursomc.repositories.CategoriaRepository;
import com.pamellagodoi.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
			"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
		
		//return obj.orElse(null);
		//findBy - se existe retorna as informação
		//se não retorna ok. Por isso é necessário tratamento de excessão
	}
}
