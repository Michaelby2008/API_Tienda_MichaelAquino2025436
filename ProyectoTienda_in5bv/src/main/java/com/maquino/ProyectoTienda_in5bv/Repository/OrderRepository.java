package com.maquino.ProyectoTienda_in5bv.Repository;

import com.maquino.ProyectoTienda_in5bv.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}