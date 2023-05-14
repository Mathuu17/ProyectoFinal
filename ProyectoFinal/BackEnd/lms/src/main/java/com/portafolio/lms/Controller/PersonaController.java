
package com.portafolio.lms.Controller;

import com.portafolio.lms.Entity.Persona;
import com.portafolio.lms.Interface.IntPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IntPersonaService intpersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return intpersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        intpersonaService.savePersona(persona);
        return "La persona fue creada";
    }
    @DeleteMapping("/personas/borrar/(id)")
    public String deletePersona(@PathVariable Long id){
        intpersonaService.deletePersona(id);
        return "Persona Eliminada";
    }
    
    @PutMapping("/persona/editar/id")
    public Persona editPersona(@PathVariable Long id, 
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("imagen") String nuevoImagen){
        
        Persona persona = intpersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImagen(nuevoImagen);
        
        intpersonaService.savePersona(persona);
        return persona;
        
    }
    
}
