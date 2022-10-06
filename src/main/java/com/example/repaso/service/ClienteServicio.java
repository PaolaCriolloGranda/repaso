package com.example.repaso.service;

import com.example.repaso.model.Cliente;

import java.util.List;

public interface ClienteServicio {
    public List<Cliente> findByAll();

    public Cliente crear(Cliente cliente);

    public Cliente findById(Long id);

    public void delete(Long id);
}
