package com.joile.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joile.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
