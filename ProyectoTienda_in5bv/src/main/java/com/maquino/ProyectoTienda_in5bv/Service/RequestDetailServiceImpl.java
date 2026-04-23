package com.maquino.ProyectoTienda_in5bv.Service;

import com.maquino.ProyectoTienda_in5bv.Entity.RequestDetail;
import com.maquino.ProyectoTienda_in5bv.Repository.RequestDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RequestDetailServiceImpl implements RequestDetailService {

    @Autowired
    private RequestDetailRepository repository;

    @Override
    public List<RequestDetail> listar() {
        return repository.findAll();
    }

    @Override
    public void guardar(RequestDetail detalle) {
        repository.save(detalle);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}