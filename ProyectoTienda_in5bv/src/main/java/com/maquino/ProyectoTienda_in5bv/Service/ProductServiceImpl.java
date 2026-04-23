package com.maquino.ProyectoTienda_in5bv.Service;

import com.maquino.ProyectoTienda_in5bv.Entity.Product;
import com.maquino.ProyectoTienda_in5bv.Repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override public List<Product> listar() { return repository.findAll(); }
    @Override public Product guardar(Product p) { return repository.save(p); }
    @Override public void eliminar(Integer id) { repository.deleteById(id); }
    @Override public Product obtenerPorId(Integer id) { return repository.findById(id).orElse(null); }
}