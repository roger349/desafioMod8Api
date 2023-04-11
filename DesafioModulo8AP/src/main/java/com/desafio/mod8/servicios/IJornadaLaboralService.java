package com.desafio.mod8.servicios;


import com.desafio.mod8.modelo.JornadaLaboral;
import java.util.List;

public interface IJornadaLaboralService {
    public List<JornadaLaboral> verDatosJL();
     
    public void agregarDatosJL(JornadaLaboral jl);
  
    public void borrarDatosJL(long id);
     
    public void updateDatosJL(JornadaLaboral jl);
}
