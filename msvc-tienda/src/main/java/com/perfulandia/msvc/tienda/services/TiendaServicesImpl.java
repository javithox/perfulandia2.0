package com.perfulandia.msvc.tienda.services;

import com.perfulandia.msvc.tienda.models.Producto;
import com.perfulandia.msvc.tienda.repository.tiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaServicesImpl {

    @Autowired
    private tiendaRepository tiendaRepository;

    public List<Producto> findAll(){
        return tiendaRepository.findAll();
    }
    public Optional<Producto> findById(@PathVariable  Long id){
        return tiendaRepository.findById(id);
    };

}
