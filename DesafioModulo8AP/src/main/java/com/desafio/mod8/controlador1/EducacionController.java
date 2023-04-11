package com.desafio.mod8.controlador1;

import com.desafio.mod8.modelo.Educacion;
import com.desafio.mod8.servicios.IEducacionService;
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
public class EducacionController { 
    
    @Autowired
    private IEducacionService IEduServ;
    
    @PostMapping("/new/Educacion") 
    public void agregarDatosEdu(@RequestBody Educacion edu){
        IEduServ.agregarDatosEdu(edu);
    }  
    @GetMapping("/ver/datosEducacion")
    @ResponseBody
    public List<Educacion> verDatosEdu(){
        return IEduServ.verDatosEdu();
    }
    @DeleteMapping("/deleteEducacion/{id}")
     public void borrarDatosEdu(@PathVariable long id){
        IEduServ.borrarDatosEdu(id);
     }    
    @PutMapping("/update/Educacion")
    public void updateDatosEdu(@RequestBody Educacion edu) {
        IEduServ.updateDatosEdu(edu);
    }
    
}
