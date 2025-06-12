package com.perfulandia.msvc.producto.controller;


import com.perfulandia.msvc.producto.models.Producto;
import com.perfulandia.msvc.producto.services.productoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/producto")
@Validated
public class GestionProducto {

    @Autowired
    private productoServices productoServices;

    @GetMapping("/producto")
    public ResponseEntity<List<Producto>>findAll(){
        return ResponseEntity .status(HttpStatus.OK).body(this.productoServices.findAll());
    }

    @GetMapping("/producto/{id}")
    public Producto findById(@PathVariable Long id){
        return this.productoServices.findById(id);
    }


}
