package com.desafio.mod8.repository;

import com.desafio.mod8.modelo.JornadaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaLaboralRepositorio extends JpaRepository<JornadaLaboral, Long>{
}
