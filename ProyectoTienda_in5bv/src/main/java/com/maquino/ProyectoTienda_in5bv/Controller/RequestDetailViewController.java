package com.maquino.ProyectoTienda_in5bv.Controller;

import com.maquino.ProyectoTienda_in5bv.Entity.RequestDetail;
import com.maquino.ProyectoTienda_in5bv.Service.RequestDetailService;
import com.maquino.ProyectoTienda_in5bv.Service.OrderService;
import com.maquino.ProyectoTienda_in5bv.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/detalles")
public class RequestDetailViewController {

    private final RequestDetailService detalleService;
    private final OrderService orderService;
    private final ProductService productService;

    public RequestDetailViewController(RequestDetailService d, OrderService p, ProductService pr) {
        this.detalleService = d;
        this.orderService = p;
        this.productService = pr;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listaDetalles", detalleService.listar());
        model.addAttribute("listaPedidos", orderService.listar());
        model.addAttribute("listaProductos", productService.listar());
        return "detalles";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute RequestDetail detalle) {
        detalleService.guardar(detalle);
        return "redirect:/detalles";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        detalleService.eliminar(id);
        return "redirect:/detalles";
    }
}