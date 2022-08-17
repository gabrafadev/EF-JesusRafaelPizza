package com.idat.EFJesusRafaelPizza.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFJesusRafaelPizza.dto.Cliente;


@FeignClient(name="EF-JesusRafaelCliente", url="localhost:8080")
public interface OpenFeignClient {

	@GetMapping("/api/cliente/v1/listar")
	public List<Cliente> listarPizzas();
}
