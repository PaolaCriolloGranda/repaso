package com.example.repaso.repository;

import com.example.repaso.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedidos, Long> {
}
