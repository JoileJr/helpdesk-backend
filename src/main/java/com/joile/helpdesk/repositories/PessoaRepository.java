package com.joile.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joile.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
