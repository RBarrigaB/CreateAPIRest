package com.edutecno.ensayo.createAPI.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.ensayo.createAPI.model.Cliente;
import com.edutecno.ensayo.createAPI.service.ClienteService;

@RestController
@RequestMapping("/api/v1/listadoClientes")
public class ClienteController {

	@Autowired
	ClienteService clienteservice;
	
	@GetMapping
	public List<Cliente> findAll(){
		return clienteservice.findAll();
	}
	
}
