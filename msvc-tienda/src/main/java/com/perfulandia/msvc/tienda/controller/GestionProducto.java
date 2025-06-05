package com.perfulandia.msvc.tienda.controller;

import com.perfulandia.msvc.tienda.models.Producto;
import com.perfulandia.msvc.tienda.repository.tiendaRepository;
import com.perfulandia.msvc.tienda.services.TiendaServicesImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/producto")
@Validated
public class GestionProducto {


    private Producto producto;
    private TiendaServicesImpl tiendaServices;

    @GetMapping("producto/{id}")
    public ResponseEntity<Optional<Producto>> findById(@PathVariable Long id){
        return ResponseEntity .status(HttpStatus.OK).body(this.tiendaServices.findById(id));
        }
    }
