package com.desafio.mod8.controlador1;
import com.desafio.mod8.modelo.Proyectos;
import com.desafio.mod8.servicios.IProyectosService;
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
public class ProyectosController {
     @Autowired
    private IProyectosService IProServ;
    
    @PostMapping("/new/proyecto") 
    public void agregarDatosProy(@RequestBody Proyectos proy){
        IProServ.agregarDatosProy(proy);
    }  
    @GetMapping("/ver/datosProyecto")
    @ResponseBody
    public List<Proyectos> verDatosProy(){
        return IProServ.verDatosProy();
    }
    @DeleteMapping("/deleteProyecto/{id}")
     public void borrarDatosProy(@PathVariable long id){
        IProServ.borrarDatosProy(id);
     }    
    @PutMapping("/update/Proyecto")
    public void updateDatosProy(@RequestBody Proyectos proy) {
        IProServ.updateDatosProy(proy);
    }
}
