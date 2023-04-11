package com.desafio.mod8.servicios;

import com.desafio.mod8.modelo.Educacion;
import com.desafio.mod8.repository.EducacionRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public EducacionRepositorio EduRepo;
    
    @Override
    public List<Educacion> verDatosEdu() {
        return EduRepo.findAll();
    }

    @Override
    public void agregarDatosEdu(Educacion edu) {
        EduRepo.save(edu);
    }

    @Override
    public void borrarDatosEdu(long id) {
        EduRepo.deleteById(id);
    }    
 
    @Override
    public void updateDatosEdu(Educacion edu) {
        EduRepo.save(edu);
    }   
}
