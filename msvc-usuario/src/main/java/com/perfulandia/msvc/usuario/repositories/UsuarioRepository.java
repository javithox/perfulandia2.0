package com.perfulandia.msvc.usuario.repositories;

import com.perfulandia.msvc.usuario.models.Usurio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usurio,Long> {
}
