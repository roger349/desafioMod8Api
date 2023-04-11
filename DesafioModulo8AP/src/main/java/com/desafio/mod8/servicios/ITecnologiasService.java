package com.desafio.mod8.servicios;

import com.desafio.mod8.modelo.Tecnologias;
import java.util.List;

public interface ITecnologiasService {
    
    public List<Tecnologias> verDatosTec();
     
    public void agregarDatosTec(Tecnologias tec);
  
    public void borrarDatosTec(long id);
    
    public void updateDatosTec(Tecnologias tec);
}
