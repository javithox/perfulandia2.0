package com.perfulandia.msvc.producto.services;

import com.perfulandia.msvc.producto.models.Producto;
import com.perfulandia.msvc.producto.repositories.productoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements productoServices{

    @Autowired
    private productoRepository productoRepository;

    public List<Producto> findAll(){return this.productoRepository.findAll();}
    public Producto findById(@PathVariable Long id){return this.productoRepository.findById(id).get();}

    @Override
    public Producto save(Producto producto) {
        return null;
    }

    @Override
    public Producto deleteById(Long id) {
        return null;
    }
}
