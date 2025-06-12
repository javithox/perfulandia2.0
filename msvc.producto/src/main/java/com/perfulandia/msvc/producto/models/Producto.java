package com.perfulandia.msvc.producto.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Producto {
    @Id
    private Long id;
    private String nombre;
    private Integer costo;
    private String descripcion;
    private Integer Stock;
    private String tipo_producto;
    private String marca;
    private String modelo;
}
