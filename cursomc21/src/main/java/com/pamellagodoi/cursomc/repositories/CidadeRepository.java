package com.pamellagodoi.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pamellagodoi.cursomc.domain.Cidade;

@Repository

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	//Interface que acessa o banco de dados na base categorias
}
