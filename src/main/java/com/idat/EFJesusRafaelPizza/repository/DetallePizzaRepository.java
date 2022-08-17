package com.idat.EFJesusRafaelPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJesusRafaelPizza.entity.PizzaDetalle;


@Repository
public interface DetallePizzaRepository extends JpaRepository<PizzaDetalle, Integer> {

}
