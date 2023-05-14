package com.portafolio.lms.Service;

import com.portafolio.lms.Entity.Persona;
import com.portafolio.lms.Interface.IntPersonaService;
import com.portafolio.lms.Repository.IntPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IntPersonaService{
    @Autowired IntPersonaRepository intpersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = intpersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        intpersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        intpersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = intpersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
