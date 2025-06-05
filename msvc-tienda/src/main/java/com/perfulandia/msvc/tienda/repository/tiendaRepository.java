package com.perfulandia.msvc.tienda.repository;

import com.perfulandia.msvc.tienda.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface tiendaRepository extends JpaRepository<Producto,Long> {
}
