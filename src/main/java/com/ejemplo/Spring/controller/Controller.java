package com.ejemplo.Spring.controller;

import com.ejemplo.Spring.model.Persona;
import com.ejemplo.Spring.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    public IPersonaService persoServi;
    
    
    @PostMapping("/new/persona")
    public void crearPersona(@RequestBody Persona pers){
        //listaPersonas.add(pers);
        persoServi.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    public List<Persona> verPersonas(){
        //return listaPersonas;
        return persoServi.verPersonas();
    }
    
    @PutMapping("/mod/persona")
    public void modificarPersona(@RequestBody Persona pers){
        /*Long opcion = pers.getId();

        for(int i=0; i<listaPersonas.size(); i++) {
             if (Objects.equals(listaPersonas.get(i).getId(), opcion)) {
                listaPersonas.set(i, pers);
            }
        }*/
        persoServi.editarPersona(pers);
    }
    
    @DeleteMapping("/del/persona")
    public void eliminarPersona(@RequestParam long id){

        /*for(int i=0; i<listaPersonas.size(); i++) {
             if (Objects.equals(listaPersonas.get(i).getId(), id)) {
                listaPersonas.remove(i);
            }
        }*/
        persoServi.eliminarPersona(id);
    }
    
    @GetMapping("/search/persona")
    public Persona buscarPersona(@RequestParam long id){
        return persoServi.buscarPersona(id);
    }
}
