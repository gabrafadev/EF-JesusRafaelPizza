package com.idat.EFJesusRafaelPizza.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="detalle_pizza_cliente")
public class PizzaDetalle {
	
	@Id
	private ClientePizzaFK fk =new ClientePizzaFK();

	public ClientePizzaFK getFk() {
		return fk;
	}

	public void setFk(ClientePizzaFK fk) {
		this.fk = fk;
	}
	

}