package com.desafio.mod8.servicios;

import com.desafio.mod8.modelo.ExperienciaLaboral;
import java.util.List;

public interface IExperienciaLaboralService {
    
    public List<ExperienciaLaboral> verDatosEL();
     
    public void agregarDatosEL(ExperienciaLaboral exp);
  
    public void borrarDatosEL(long id);
       
    public void updateDatosEL(ExperienciaLaboral exp);
}
