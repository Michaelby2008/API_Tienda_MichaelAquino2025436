package com.maquino.ProyectoTienda_in5bv.Service;

import com.maquino.ProyectoTienda_in5bv.Entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listar();
    Category obtenerPorId(Integer id);
    Category guardar(Category category);
    void eliminar(Integer id);
}