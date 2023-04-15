package com.joile.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joile.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
