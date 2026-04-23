package com.maquino.ProyectoTienda_in5bv.Repository;

import com.maquino.ProyectoTienda_in5bv.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}