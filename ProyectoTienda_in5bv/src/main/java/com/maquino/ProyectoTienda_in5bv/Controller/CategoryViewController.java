package com.maquino.ProyectoTienda_in5bv.Controller;

import com.maquino.ProyectoTienda_in5bv.Entity.Category;
import com.maquino.ProyectoTienda_in5bv.Service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categorias")
public class CategoryViewController {

    private final CategoryService categoryService;

    public CategoryViewController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listaCategorias", categoryService.listar());
        return "categorias";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Category category) {
        categoryService.guardar(category);
        return "redirect:/categorias";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        categoryService.eliminar(id);
        return "redirect:/categorias";
    }
}