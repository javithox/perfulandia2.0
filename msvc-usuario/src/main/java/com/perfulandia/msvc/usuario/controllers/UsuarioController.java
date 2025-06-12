package com.perfulandia.msvc.usuario.controllers;

import com.perfulandia.msvc.usuario.models.Usuario;
import com.perfulandia.msvc.usuario.repositories.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/Usuarios")
@Validated
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Usuario>> FindById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(this.usuarioRepository.findById(id));
    }
    @GetMapping("/usuario/nombre")
    public ResponseEntity<Usuario> FindByName(@PathVariable String nombre){
        return ResponseEntity.status(HttpStatus.OK).body(this.usuarioRepository.findByNombre(nombre));
    }
    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody @Valid Usuario gestionUsuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.usuarioRepository.save(gestionUsuario));

    }
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>>findAll(){
        return ResponseEntity .status(HttpStatus.OK).body(this.usuarioRepository.findAll());
    }
}
