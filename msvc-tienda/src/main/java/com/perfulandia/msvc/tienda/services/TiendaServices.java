package com.perfulandia.msvc.tienda.services;

import com.perfulandia.msvc.tienda.models.Producto;
import com.perfulandia.msvc.tienda.models.entities.Tienda;

import java.util.List;

public interface TiendaServices {

    List<Tienda> findAll();
    Tienda findByCantUsuario(int cantUsuarios);
    Object findByProducto(String nombre);

    Tienda findBynombre(String nombre);
}
