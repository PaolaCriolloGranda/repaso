package com.example.repaso.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Cliente {
    private Long cliente_id;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;

    public Cliente(Long cliente_id, String nombre, String primer_apellido, String segundo_apellido) {
        this.cliente_id = cliente_id;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }

    public Cliente() {
    }

}
