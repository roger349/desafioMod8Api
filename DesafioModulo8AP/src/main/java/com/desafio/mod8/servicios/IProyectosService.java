package com.desafio.mod8.servicios;


import com.desafio.mod8.modelo.Proyectos;
import java.util.List;

public interface IProyectosService {
    
    public List<Proyectos> verDatosProy();
     
    public void agregarDatosProy(Proyectos proy);
  
    public void borrarDatosProy(long id);
     
    public void updateDatosProy(Proyectos proy);    
}
