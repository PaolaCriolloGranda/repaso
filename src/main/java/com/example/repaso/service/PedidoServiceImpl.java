package com.example.repaso.service;

import com.example.repaso.model.Pedidos;
import com.example.repaso.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public List<Pedidos> findByAll() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedidos crear(Pedidos pedidos) {
        return pedidoRepository.save(pedidos);
    }

    @Override
    public Pedidos findById(Long id) {
        return pedidoRepository.findById(id).orElse(new Pedidos());
    }

    @Override
    public void delete(Long id) {
        pedidoRepository.deleteById(id);
    }
}
