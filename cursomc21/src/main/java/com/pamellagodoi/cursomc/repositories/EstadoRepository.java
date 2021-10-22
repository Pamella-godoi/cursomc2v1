package com.pamellagodoi.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pamellagodoi.cursomc.domain.Estado;

@Repository

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
