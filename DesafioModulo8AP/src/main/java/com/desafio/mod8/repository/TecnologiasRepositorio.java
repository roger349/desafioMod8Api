package com.desafio.mod8.repository;
import com.desafio.mod8.modelo.Tecnologias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiasRepositorio extends JpaRepository<Tecnologias, Long> {    
}
