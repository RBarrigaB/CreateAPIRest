package com.edutecno.ensayo.createAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	@Id
	@Column(columnDefinition="char")
	private String idCliente;
	private String nombreCompania;
	private String nombreContacto;
	private String tituloContacto;
	private String direccion;
	private String ciudad;
	private String region;
	private String codigoPostal;
	private String pais;
	private String telefono;
	private String mail;
	private String clave;
}
