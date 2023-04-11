package com.desafio.mod8.repository;

import com.desafio.mod8.modelo.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepositorio extends JpaRepository<Proyectos, Long> {
}
