package com.maquino.ProyectoTienda_in5bv.Service;

import com.maquino.ProyectoTienda_in5bv.Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> listar();
    Product guardar(Product product);
    void eliminar(Integer id);
    Product obtenerPorId(Integer id);
}