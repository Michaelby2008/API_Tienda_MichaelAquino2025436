package com.maquino.ProyectoTienda_in5bv.Controller;
import com.maquino.ProyectoTienda_in5bv.Entity.Order;
import com.maquino.ProyectoTienda_in5bv.Service.OrderService;
import com.maquino.ProyectoTienda_in5bv.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pedidos")
public class OrderViewController {
    private final OrderService orderService;
    private final UserService userService;

    public OrderViewController(OrderService orderService, UserService userService) {
        this.orderService = orderService;
        this.userService = userService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listaPedidos", orderService.listar());
        model.addAttribute("listaUsuarios", userService.listar());
        return "pedidos";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Order order) {
        orderService.guardar(order);
        return "redirect:/pedidos";
    }
}