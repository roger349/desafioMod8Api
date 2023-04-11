package com.desafio.mod8.servicios;

import com.desafio.mod8.modelo.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verDatosEdu();
     
    public void agregarDatosEdu(Educacion edu);
  
    public void borrarDatosEdu(long id);
     
    public void updateDatosEdu(Educacion edu);
}
