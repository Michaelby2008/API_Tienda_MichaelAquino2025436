package com.maquino.ProyectoTienda_in5bv.Repository;

import com.maquino.ProyectoTienda_in5bv.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}