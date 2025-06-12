package com.perfulandia.msvc.tienda.repository;

import com.perfulandia.msvc.tienda.models.entities.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface tiendaRepository extends JpaRepository<Tienda,Long> {
    Tienda findByNombre(String nombre);


    Tienda findByCantUsuario(int cantUsuarios);
}
