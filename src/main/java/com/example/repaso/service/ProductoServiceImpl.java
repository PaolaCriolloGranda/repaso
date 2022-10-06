package com.example.repaso.service;

import com.example.repaso.model.Producto;
import com.example.repaso.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> findByAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto crear(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(new Producto());
    }

    @Override
    public void delete(Long id) {
        productoRepository.deleteById(id);
    }
}
