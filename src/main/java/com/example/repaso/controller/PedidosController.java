package com.example.repaso.controller;

import com.example.repaso.model.Cliente;
import com.example.repaso.model.Pedidos;
import com.example.repaso.service.ClienteServiceImpl;
import com.example.repaso.service.PedidoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidosController {
    @Autowired
    PedidoServiceImpl pedidoS;

    @GetMapping("/listar")
    public ResponseEntity<List<Pedidos>> listar() {
        return new ResponseEntity<>(pedidoS.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Pedidos> crearPedido(@RequestBody Pedidos p) {

        return new ResponseEntity<>(pedidoS.crear(p), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Pedidos> eliminarPedido(@PathVariable Long id) {
        pedidoS.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Pedidos> actualizarPedido(@PathVariable Long id, @RequestBody Pedidos p) {
        Pedidos pedidos = pedidoS.findById(id);
        if (pedidos == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                pedidos.setEstado_pedido(p.getEstado_pedido());
                pedidos.setFecha_pedido(p.getFecha_pedido());
                return new ResponseEntity<>(pedidoS.crear(p), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
}
