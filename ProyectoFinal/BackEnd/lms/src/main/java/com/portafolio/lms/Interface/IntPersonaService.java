
package com.portafolio.lms.Interface;

import com.portafolio.lms.Entity.Persona;
import java.util.List;



public interface IntPersonaService {
    //traer lista
    public List<Persona> getPersona();
    //guardar
    public void savePersona(Persona persona);
    //eliminar por id
    public void deletePersona(Long id);
    //buscar por id
    public Persona findPersona(Long id);
    
    
}
