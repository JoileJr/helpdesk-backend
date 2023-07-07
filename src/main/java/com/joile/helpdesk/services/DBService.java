package com.joile.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joile.helpdesk.domain.Chamado;
import com.joile.helpdesk.domain.Cliente;
import com.joile.helpdesk.domain.Tecnico;
import com.joile.helpdesk.domain.enums.Perfil;
import com.joile.helpdesk.domain.enums.Prioridade;
import com.joile.helpdesk.domain.enums.Status;
import com.joile.helpdesk.repositories.ChamadoRepository;
import com.joile.helpdesk.repositories.ClienteRepository;
import com.joile.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDb() {
		Tecnico tec1 = new Tecnico(null, "Joile junior", "10693575964", "joile@email.com", "admin123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Jose silva", "12032295534", "jose@email.com", "cliente123");
		cli1.addPerfil(Perfil.CLIENTE);

		Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "primeiro chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(cha1));

	}
}
