package com.desafio.mod8.servicios;

import com.desafio.mod8.modelo.ExperienciaLaboral;
import com.desafio.mod8.repository.ExperienciaLaboralRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired
    public ExperienciaLaboralRepositorio ExpLabRep;
   
    @Override
    public List<ExperienciaLaboral> verDatosEL() {
        return ExpLabRep.findAll();
    }
    @Override
    public void agregarDatosEL(ExperienciaLaboral exp) {
        ExpLabRep.save(exp);
    }
    
    @Override
    public void borrarDatosEL(long id) {
        ExpLabRep.deleteById(id);
    }

    @Override
    public void updateDatosEL(ExperienciaLaboral exp) {
        ExpLabRep.save(exp);
    }  
}
