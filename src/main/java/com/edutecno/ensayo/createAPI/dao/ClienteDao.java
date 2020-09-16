package com.edutecno.ensayo.createAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutecno.ensayo.createAPI.model.Cliente;

public interface ClienteDao extends JpaRepository<Cliente,String>{

}
