package com.example.repaso.service;

import com.example.repaso.model.Cliente;
import com.example.repaso.model.Producto;

import java.util.List;

public interface ProductoService{
    public List<Producto> findByAll();

    public Producto crear(Producto producto);

    public Producto findById(Long id);

    public void delete(Long id);
}
