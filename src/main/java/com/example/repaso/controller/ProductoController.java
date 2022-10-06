package com.example.repaso.controller;

import com.example.repaso.model.Cliente;
import com.example.repaso.model.Producto;
import com.example.repaso.service.ClienteServiceImpl;
import com.example.repaso.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoServiceImpl productoS;

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listar() {
        return new ResponseEntity<>(productoS.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto p) {

        return new ResponseEntity<>(productoS.crear(p), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Producto> eliminarProducto(@PathVariable Long id) {
        productoS.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Long id, @RequestBody Producto p) {
        Producto producto = productoS.findById(id);
        if (producto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                producto.setTipo_producto(p.getTipo_producto());
                producto.setNombre_producto(p.getNombre_producto());
                return new ResponseEntity<>(productoS.crear(p), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

}
