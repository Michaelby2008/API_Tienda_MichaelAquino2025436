package com.maquino.ProyectoTienda_in5bv.Repository;

import com.maquino.ProyectoTienda_in5bv.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}