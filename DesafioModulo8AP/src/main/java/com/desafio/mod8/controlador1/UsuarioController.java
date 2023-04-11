package com.desafio.mod8.controlador1;

import com.desafio.mod8.modelo.Usuario;
import com.desafio.mod8.servicios.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
     @Autowired
    private IUsuarioService IUserServ;
    
    @PostMapping("/new/Usuario") 
    public void agregarDatosUser(@RequestBody Usuario user){
        IUserServ.agregarDatosUser(user);
    }  
    @GetMapping("/ver/datosUsuario")
    @ResponseBody
    public List<Usuario> verDatosUser(){
        return IUserServ.verDatosUser();
    }
    @DeleteMapping("/deleteUsuario/{id}")
     public void borrarDatosUser(@PathVariable long id){
        IUserServ.borrarDatosUser(id);
     }
      @GetMapping("/buscar/Persona")
    public void buscarDatosUser(@PathVariable long id){
         IUserServ.buscarDatosUser(id);
    }  
    @PutMapping("/update/Usuario")
    public void updateDatosJL(@RequestBody Usuario user) {
        IUserServ.updateDatosUser(user);
    }
}
