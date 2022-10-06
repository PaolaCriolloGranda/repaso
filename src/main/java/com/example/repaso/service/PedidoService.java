package com.example.repaso.service;

import com.example.repaso.model.Pedidos;
import com.example.repaso.model.Producto;

import java.util.List;

public interface PedidoService {

    public List<Pedidos> findByAll();

    public Pedidos crear(Pedidos producto);

    public Pedidos findById(Long id);

    public void delete(Long id);
}
