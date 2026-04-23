package com.maquino.ProyectoTienda_in5bv.Service;
import com.maquino.ProyectoTienda_in5bv.Entity.Order;
import com.maquino.ProyectoTienda_in5bv.Repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;
    public OrderServiceImpl(OrderRepository repository) { this.repository = repository; }
    @Override public List<Order> listar() { return repository.findAll(); }
    @Override public Order guardar(Order p) { return repository.save(p); }
    @Override public void eliminar(Integer id) { repository.deleteById(id); }
}