package com.example.repaso.service;

import com.example.repaso.model.Cliente;
import com.example.repaso.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteServicio{

    @Autowired
    ClienteRepository repository;

    @Override
    public List<Cliente> findByAll() {
        return repository.findAll();
    }

    @Override
    public Cliente crear(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public Cliente findById(Long id) {
        return repository.findById(id).orElse(new Cliente());
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
