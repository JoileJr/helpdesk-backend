package com.joile.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joile.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
