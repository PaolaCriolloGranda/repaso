package com.example.repaso.model;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
public class Pedidos {
    private Long pedido_id;
    private Date fecha_pedido;
    private String estado_pedido;
    private Long cliente_id;
    private Long vendedor_id;

    public Pedidos() {
    }

    public Pedidos(Long pedido_id, Date fecha_pedido, String estado_pedido, Long cliente_id, Long vendedor_id) {
        this.pedido_id = pedido_id;
        this.fecha_pedido = fecha_pedido;
        this.estado_pedido = estado_pedido;
        this.cliente_id = cliente_id;
        this.vendedor_id = vendedor_id;
    }
}
