package com.perfulandia.msvc.tienda.services;

import com.perfulandia.msvc.tienda.models.Producto;

import java.util.List;

public interface TiendaServices {

    List<Producto> findAll();
    Producto findById(Long id);
    Producto save(Producto producto);
    Producto deleteById(Long id);
}
