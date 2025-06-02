package com.perfulandia.msvc.usuario.DTO;

import lombok.*;

import java.time.LocalDateTime;
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class UsuarioDTO {

    private LocalDateTime horaCompra;

    private Integer costo;

    private String nombre;

    private String apellido;

    private String roles;
}
