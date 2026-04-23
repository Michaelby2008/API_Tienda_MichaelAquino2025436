package com.maquino.ProyectoTienda_in5bv.Controller;

import com.maquino.ProyectoTienda_in5bv.Entity.User;
import com.maquino.ProyectoTienda_in5bv.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserViewController {

    private final UserService userService;

    public UserViewController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/usuarios")
    public String viewUsuarios(Model model) {
        model.addAttribute("listaUsuarios", userService.listar());
        return "usuarios";
    }

    @PostMapping("/usuarios/guardar")
    public String guardarUsuario(@ModelAttribute User user) {
        if (user.getIdUsuario() != null && user.getIdUsuario() > 0) {
            // Si el ID ya existe, intentamos actualizar
            userService.actualizar(user.getIdUsuario(), user);
        } else {
            // Si el ID es nulo o 0, es un nuevo registro
            userService.crear(user);
        }
        return "redirect:/usuarios";
    }

    @PostMapping("/usuarios/eliminar")
    public String eliminarUsuario(@RequestParam("idUsuario") Integer idUsuario) {
        userService.eliminar(idUsuario);
        return "redirect:/usuarios";
    }
}