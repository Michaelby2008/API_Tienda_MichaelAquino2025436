package com.maquino.ProyectoTienda_in5bv.Controller;

import com.maquino.ProyectoTienda_in5bv.Entity.Product;
import com.maquino.ProyectoTienda_in5bv.Service.ProductService;
import com.maquino.ProyectoTienda_in5bv.Service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
public class ProductViewController {

    private final ProductService productService;
    private final CategoryService categoryService;

    public ProductViewController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listaProductos", productService.listar());
        model.addAttribute("listaCategorias", categoryService.listar());
        return "productos";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Product product) {
        productService.guardar(product);
        return "redirect:/productos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        productService.eliminar(id);
        return "redirect:/productos";
    }
}