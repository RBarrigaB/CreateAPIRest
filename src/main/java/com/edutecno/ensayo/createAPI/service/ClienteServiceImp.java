package com.edutecno.ensayo.createAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.ensayo.createAPI.dao.ClienteDao;
import com.edutecno.ensayo.createAPI.model.Cliente;

@Service
public class ClienteServiceImp implements ClienteService{

	@Autowired
	ClienteDao clienteDao;
	
	@Override
	public List<Cliente> findAll() {

		return clienteDao.findAll();
	}

}
