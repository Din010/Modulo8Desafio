package com.ejemplo.Spring.service;

import com.ejemplo.Spring.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public void editarPersona(Persona pers);
    
    public void crearPersona(Persona pers);
    
    public void eliminarPersona(Long id);
    
    public Persona buscarPersona(Long id);
}
