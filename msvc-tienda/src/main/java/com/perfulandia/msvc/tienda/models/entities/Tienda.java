package com.perfulandia.msvc.tienda.models.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name = "tienda")
public class Tienda {
    private String nombreTienda;
    private int numTienda;

    private int cantStock;

    private int cantUsuarios;
}
