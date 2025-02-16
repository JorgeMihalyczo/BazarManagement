package com.bazar.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id_cliente;
    private String nombre;
    private String apellido;
    private String dni;

    @OneToMany(mappedBy = "unCliente")
    private List<Venta> unaVenta;

    public Cliente() {
    }

    public Cliente(long id_cliente, String nombre, String apellido, String dni) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}
