package com.perfulandia.msvc.producto.repositories;

import com.perfulandia.msvc.producto.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoRepository extends JpaRepository<Producto,Long> {

}
