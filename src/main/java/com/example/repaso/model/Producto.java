package com.example.repaso.model;

import lombok.*;

@Data
@Getter
@Setter

public class Producto {
    private Long producto_id;
    private String nombre_producto;
    private String tipo_producto;

    public Producto() {
    }

    public Producto(Long producto_id, String nombre_producto, String tipo_producto) {
        this.producto_id = producto_id;
        this.nombre_producto = nombre_producto;
        this.tipo_producto = tipo_producto;
    }
}
