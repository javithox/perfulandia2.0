package com.perfulandia.msvc.usuario.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    @NotNull
    private Long id;

    @NotNull
    @Column(name = "Nombre usuario")
    private String nombre;

    @Column(name = "apellido usuario")
    private String apellido;
    private String roles;
}
