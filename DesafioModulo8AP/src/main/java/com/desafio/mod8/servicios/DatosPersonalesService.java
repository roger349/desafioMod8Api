package com.desafio.mod8.servicios;

import com.desafio.mod8.modelo.DatosPersonales;
import com.desafio.mod8.repository.DatosPersonalesRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosPersonalesService implements IDatosPersonalesService {
    @Autowired
    public DatosPersonalesRepositorio DatosPerRep;
    @Override
    public List<DatosPersonales> verDatosPersonas() {
        return DatosPerRep.findAll();
    }
    @Override
    public void agregarDatosPersona(DatosPersonales per) {
        DatosPerRep.save(per);
    }
    @Override
    public void borrarDatosPersona(long id) {
        DatosPerRep.deleteById(id);
    }    
    @Override
    public void updateDatosPersona(DatosPersonales per){
        DatosPerRep.save(per);
    }   
}
 