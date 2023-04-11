package com.desafio.mod8.controlador1;

import com.desafio.mod8.modelo.ExperienciaLaboral;
import com.desafio.mod8.servicios.IExperienciaLaboralService;
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
public class ExperienciaLaboralController {
     @Autowired
    private IExperienciaLaboralService IExpLServ;
    
    @PostMapping("/new/Experiencia") 
    public void agregarDatosEL(@RequestBody ExperienciaLaboral exp){
        IExpLServ.agregarDatosEL(exp);
    }  
    @GetMapping("/ver/datosExperiencia")
    @ResponseBody
    public List<ExperienciaLaboral> verDatosEL(){
        return IExpLServ.verDatosEL();
    }
    @DeleteMapping("/deleteExp/{id}")
     public void borrarDatosEL(@PathVariable long id){
        IExpLServ.borrarDatosEL(id);
     }    
    @PutMapping("/update/Experiencia")
    public void updateDatosEL(@RequestBody ExperienciaLaboral exp) {
        IExpLServ.updateDatosEL(exp);
    }
    
}
