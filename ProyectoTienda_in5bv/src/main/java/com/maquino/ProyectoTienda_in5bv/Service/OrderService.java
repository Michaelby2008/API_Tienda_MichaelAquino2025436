package com.maquino.ProyectoTienda_in5bv.Service;
import com.maquino.ProyectoTienda_in5bv.Entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> listar();
    Order guardar(Order order);
    void eliminar(Integer id);
}