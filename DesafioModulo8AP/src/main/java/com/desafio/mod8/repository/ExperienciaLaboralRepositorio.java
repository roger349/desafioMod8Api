package com.desafio.mod8.repository;

import com.desafio.mod8.modelo.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepositorio extends JpaRepository<ExperienciaLaboral, Long> {   
}
