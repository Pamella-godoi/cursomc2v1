package com.pamellagodoi.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pamellagodoi.cursomc.domain.Produto;

@Repository
//Interface que acessa o banco de dados na base categorias
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	
}
