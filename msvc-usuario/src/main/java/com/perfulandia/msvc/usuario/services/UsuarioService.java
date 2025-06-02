package com.perfulandia.msvc.usuario.services;

import com.perfulandia.msvc.usuario.models.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findById(Long id);
    Usuario findByNombre(String nombre);
    Usuario save(Usuario usuario);
}
