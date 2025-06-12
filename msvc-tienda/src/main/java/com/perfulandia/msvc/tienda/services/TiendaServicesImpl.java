package com.perfulandia.msvc.tienda.services;

import com.perfulandia.msvc.tienda.models.Producto;
import com.perfulandia.msvc.tienda.models.entities.Tienda;
import com.perfulandia.msvc.tienda.repository.tiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaServicesImpl {

    @Autowired
    private tiendaRepository tiendaRepository;

    public List<Tienda> findAll(){return this.tiendaRepository.findAll();}

    public Tienda FindBynombre(String nombre){return this.tiendaRepository.findByNombre(nombre);};
    public Tienda findByCantUsuario(int cantUsuarios){return this.tiendaRepository.findByCantUsuario(cantUsuarios);};


}
