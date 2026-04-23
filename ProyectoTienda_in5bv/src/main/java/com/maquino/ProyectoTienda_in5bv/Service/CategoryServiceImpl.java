package com.maquino.ProyectoTienda_in5bv.Service;

import com.maquino.ProyectoTienda_in5bv.Entity.Category;
import com.maquino.ProyectoTienda_in5bv.Repository.CategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> listar() {
        return categoryRepository.findAll();
    }

    @Override
    public Category obtenerPorId(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category guardar(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void eliminar(Integer id) {
        categoryRepository.deleteById(id);
    }
}