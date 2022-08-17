package com.idat.EFJesusRafaelPizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EFJesusRafaelPizza.client.OpenFeignClient;
import com.idat.EFJesusRafaelPizza.dto.Cliente;
import com.idat.EFJesusRafaelPizza.entity.ClientePizzaFK;
import com.idat.EFJesusRafaelPizza.entity.Pizza;
import com.idat.EFJesusRafaelPizza.entity.PizzaDetalle;
import com.idat.EFJesusRafaelPizza.repository.DetallePizzaRepository;
import com.idat.EFJesusRafaelPizza.repository.PizzaRepository;


public class PizzaServiceImpl implements PizzaService {

	@Autowired
	private PizzaRepository repository;
	
	@Autowired
	private DetallePizzaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public Pizza obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void asignarPizza() {
		List<Cliente> listado = feign.listarPizzas();;
		ClientePizzaFK fk = null;
		PizzaDetalle detalle = null;

		
		for (Cliente cliente : listado) {
			
			fk = new ClientePizzaFK();
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizza(111);
			
			detalle = new PizzaDetalle();
			detalle.setFk(fk);	
			
			repositoryDetalle.save(detalle);
		}
		
	}

	@Override
	public void guardar(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

}
