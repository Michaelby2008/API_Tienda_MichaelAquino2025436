package com.maquino.ProyectoTienda_in5bv.Service;

import com.maquino.ProyectoTienda_in5bv.Entity.RequestDetail;
import java.util.List;

public interface RequestDetailService {
    List<RequestDetail> listar(); // Para el método listar
    void guardar(RequestDetail detalle);
    void eliminar(Integer id); // Para el método eliminar
}