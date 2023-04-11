package com.desafio.mod8.servicios;

import com.desafio.mod8.modelo.Proyectos;
import com.desafio.mod8.repository.ProyectosRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public ProyectosRepositorio ProRep;
    
    @Override
    public List<Proyectos> verDatosProy() {
        return ProRep.findAll();
    }

    @Override
    public void agregarDatosProy(Proyectos proy) {
        ProRep.save(proy);
    }
    @Override
    public void borrarDatosProy(long id) {
        ProRep.deleteById(id);
    }
    @Override
    public void updateDatosProy(Proyectos proy) {
        ProRep.save(proy);
    }   
}
