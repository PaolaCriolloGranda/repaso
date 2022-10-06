package com.example.repaso.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "producto")
@Data
@AllArgsConstructor

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nombre_producto")
    private String nombre_producto;
    @Column(name = "tipo_producto")
    private String tipo_producto;


    public Producto() {
    }

}
