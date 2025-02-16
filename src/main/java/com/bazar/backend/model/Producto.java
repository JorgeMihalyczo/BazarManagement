package com.bazar.backend.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long codigo_proudcto;
    private String nombre;
    private String marca;
    private double costo;
    private double cantidad_disponible;

    @ManyToMany(mappedBy = "listaProductos")
    private List<Venta> unaVenta;

    public Producto() {
    }

    public Producto(long codigo_proudcto, String nombre, String marca, double costo, double cantidad_disponible) {
        this.codigo_proudcto = codigo_proudcto;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.cantidad_disponible = cantidad_disponible;
    }
}
