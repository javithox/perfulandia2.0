package com.perfulandia.msvc.tienda.controller;

import com.perfulandia.msvc.tienda.models.entities.Tienda;
import com.perfulandia.msvc.tienda.services.TiendaServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tienda")
@Validated
public class TiendaController {
    private TiendaServices tiendaServices;

    @GetMapping("/tienda")
    public ResponseEntity<List<Tienda>>findAll(){
        return ResponseEntity .status(HttpStatus.OK).body(this.tiendaServices.findAll());
    }
    @GetMapping("/tienda/producto")
    public ResponseEntity<Object> findByProducto(String producto){
        return ResponseEntity .status(HttpStatus.OK).body(this.tiendaServices.findByProducto(producto));
    }
    @GetMapping("/tienda/usuario")
    public ResponseEntity<Tienda> findByNombre(String nombre){
        return ResponseEntity .status(HttpStatus.OK).body(this.tiendaServices.findBynombre(nombre));
    }
}
