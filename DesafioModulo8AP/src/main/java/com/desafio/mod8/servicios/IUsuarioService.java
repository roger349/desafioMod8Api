package com.desafio.mod8.servicios;

import com.desafio.mod8.modelo.Usuario;
import java.util.List;

public interface IUsuarioService {
    public List<Usuario> verDatosUser();
     
    public void agregarDatosUser(Usuario user);
  
    public void borrarDatosUser(long id);
    
    public Usuario buscarDatosUser(long id);
    
    public void updateDatosUser(Usuario user); 
}
