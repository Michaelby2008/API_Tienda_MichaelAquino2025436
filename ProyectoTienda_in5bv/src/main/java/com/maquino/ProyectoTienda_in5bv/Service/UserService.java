package com.maquino.ProyectoTienda_in5bv.Service;

import com.maquino.ProyectoTienda_in5bv.Entity.User;

import java.util.List;

public interface UserService {
    List<User> listar();
    User obtnerePorId(Integer Id);
    User crear(User user);
    User actualizar(Integer id, User user);
    void eliminar(Integer id);

}