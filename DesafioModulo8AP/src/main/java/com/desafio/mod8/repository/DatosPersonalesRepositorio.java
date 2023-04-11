package com.desafio.mod8.repository;

import com.desafio.mod8.modelo.DatosPersonales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosPersonalesRepositorio extends JpaRepository<DatosPersonales, Long> {   
}
