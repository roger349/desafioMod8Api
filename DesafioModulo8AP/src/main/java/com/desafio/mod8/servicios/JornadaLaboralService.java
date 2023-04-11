package com.desafio.mod8.servicios;

import com.desafio.mod8.modelo.JornadaLaboral;
import com.desafio.mod8.repository.JornadaLaboralRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JornadaLaboralService implements IJornadaLaboralService {

    @Autowired
    public JornadaLaboralRepositorio JorLabRep;
    
    @Override
    public List<JornadaLaboral> verDatosJL() {
        return JorLabRep.findAll();
    }

    @Override
    public void agregarDatosJL(JornadaLaboral jl) {
        JorLabRep.save(jl);
    }

    @Override
    public void borrarDatosJL(long id) {
        JorLabRep.deleteById(id);
    }

    @Override
    public void updateDatosJL(JornadaLaboral jl) {
        JorLabRep.save(jl);
    }
}
