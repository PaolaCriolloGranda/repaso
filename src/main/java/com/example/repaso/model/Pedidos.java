package com.example.repaso.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pedidos")
@Data
@AllArgsConstructor

public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fecha")
    private Date fecha_pedido;
    @Column(name = "estado")
    private String estado_pedido;
    @Column(name = "cliente_id")
    private Long cliente_id;
    @Column(name = "vendedor_id")
    private Long vendedor_id;

    public Pedidos() {
    }

}
