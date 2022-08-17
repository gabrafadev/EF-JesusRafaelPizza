package com.idat.EFJesusRafaelPizza.service;



import com.idat.EFJesusRafaelPizza.entity.Pizza;


public interface PizzaService {
	
	Pizza obtenerId(Integer id);
	
	void guardar(Pizza pizza);

	
	void asignarPizza();
}
