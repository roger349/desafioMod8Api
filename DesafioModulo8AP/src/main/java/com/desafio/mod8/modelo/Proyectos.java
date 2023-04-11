package com.desafio.mod8.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Proyectos")
public class Proyectos {
    @Id
    @Column(name="id_proyecto")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_proyecto;
      
    @Column(name = "nombre_proyecto", length = 45, nullable = false)
    private String nombre_proyecto;
    @Column(name = "descripcion_proyecto", length = 200, nullable = false)
    private String descripcion_proyecto;

    public Proyectos() {
    }
    public Proyectos(long id_proyecto, String nombre_proyecto, String descripcion_proyecto) {
        this.id_proyecto = id_proyecto;
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
    }   
}
