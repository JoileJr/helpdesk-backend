package com.joile.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joile.helpdesk.domain.Tecnico;
import com.joile.helpdesk.exceptions.ObjectnotFoundException;
import com.joile.helpdesk.repositories.TecnicoRepository;

@Service
public class TecnicoService {
    
    @Autowired
    private TecnicoRepository repository;

    public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow( () -> new ObjectnotFoundException("Obejto não encontrado, ID: "+1d) );
	}

    public List<Tecnico> findAll() {
        return repository.findAll();
    }

}
