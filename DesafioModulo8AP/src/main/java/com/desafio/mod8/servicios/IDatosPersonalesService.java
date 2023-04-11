package com.desafio.mod8.servicios;

import com.desafio.mod8.modelo.DatosPersonales;
import java.util.List;

public interface IDatosPersonalesService {
    
    public List<DatosPersonales> verDatosPersonas();
     
    public void agregarDatosPersona(DatosPersonales per);
  
    public void borrarDatosPersona(long id);
    
    public void updateDatosPersona(DatosPersonales per);
}
