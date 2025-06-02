package com.perfulandia.msvc.usuario.services;

import com.perfulandia.msvc.usuario.Exceptions.UsuarioException;
import com.perfulandia.msvc.usuario.models.Usuario;
import com.perfulandia.msvc.usuario.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return this.usuarioRepository.findById(id)
                .orElseThrow(() -> new UsuarioException("Usuario con id:" + id + " no se encuentra en la base de datos"));
    }

    @Override
    public Usuario findByNombre(String nombre) {
        return this.usuarioRepository.findByNombre(nombre);
    }



    @Override
    public Usuario save(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

}
