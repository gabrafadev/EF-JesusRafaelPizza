package com.idat.EFJesusRafaelPizza.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;




@Embeddable
public class ClientePizzaFK implements Serializable{
	

	private static final long serialVersionUID = 4417214286334278898L;

	@Column(name="idPizza", nullable = false, unique = true)
	private Integer idPizza;
	
	@Column(name="idCliente", nullable = false, unique = true)
	private Integer idCliente;

	public Integer getIdPizza() {
		return idPizza;
	}

	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
}