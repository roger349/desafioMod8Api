package com.desafio.mod8.controlador1;

import com.desafio.mod8.modelo.DatosPersonales;
import com.desafio.mod8.servicios.IDatosPersonalesService;
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
public class DatosPersonalesController {
    @Autowired
    private IDatosPersonalesService IDatosPerServ;
    
    @PostMapping("/new/Persona") 
    public void agregarDatosPersona(@RequestBody DatosPersonales per){
        IDatosPerServ.agregarDatosPersona(per);
    }  
    @GetMapping("/ver/Persona")
    @ResponseBody
    public List<DatosPersonales> verDatosPersonas(){
        return IDatosPerServ.verDatosPersonas();
    }
    @DeleteMapping("/delete/{id}")
     public void borrarDatosPersona(@PathVariable long id){
        IDatosPerServ.borrarDatosPersona(id);
     }   
    @PutMapping("/update/Persona")
    public void updateDatosPersona(@RequestBody DatosPersonales per) {
        IDatosPerServ.updateDatosPersona(per);
    }
}
