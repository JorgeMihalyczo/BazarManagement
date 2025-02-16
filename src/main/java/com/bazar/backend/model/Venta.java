package com.bazar.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long codigo_venta;
    private LocalDate fecha_venta;
    private double total;

    @ManyToMany
    private List<Producto> listaProductos;

    @ManyToOne
    private Cliente unCliente;

    public Venta() {
    }

    public Venta(long codigo_venta, LocalDate fecha_venta, Cliente unCliente, double total) {
        this.codigo_venta = codigo_venta;
        this.fecha_venta = fecha_venta;
        this.unCliente = unCliente;
        this.total = total;
    }
}
