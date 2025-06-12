package com.perfulandia.msvc.producto.services;

import com.perfulandia.msvc.producto.models.Producto;

import java.util.List;

public interface productoServices {
    List<Producto> findAll();
    Producto findById(Long id);
    Producto save(Producto producto);
    Producto deleteById(Long id);
}
