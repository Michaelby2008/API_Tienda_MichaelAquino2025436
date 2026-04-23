package com.maquino.ProyectoTienda_in5bv.Controller;

import com.maquino.ProyectoTienda_in5bv.Entity.User;
import com.maquino.ProyectoTienda_in5bv.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/get")
    public List<User> listar(){
        return userService.listar();
    }

    @GetMapping("/{Id}")
    public User obtener(@PathVariable Integer Id){

        return userService.obtnerePorId(Id);
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public User crear(@RequestBody User user){
        return userService.crear(user);
    }

    @PutMapping("/put/{Id}")
    public User actualizar(@RequestBody Integer Id, @RequestBody User user){
        return userService.actualizar(Id, user);
    }

    @DeleteMapping("/{Id}")
    public User eliminar(@PathVariable Integer Id){
        userService.eliminar(Id);
        return null;
    }

}