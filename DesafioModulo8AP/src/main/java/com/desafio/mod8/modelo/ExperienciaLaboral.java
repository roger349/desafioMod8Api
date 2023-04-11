package com.desafio.mod8.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name ="ExperienciaLaboral")
public class ExperienciaLaboral {
    @Id
    @Column(name ="id_experiencia_laboral")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_experiencia_laboral;
            
    
    @Column(name = "nombre_empresa", length = 45, nullable = false)
    private String nombre_empresa;
    @Column(name = "fecha_inicio", length = 45, nullable = false)
    private String fecha_inicio;
    @Column(name = "fecha_fin", length = 45, nullable = false)
    private String nombre_fin;
    @Column(name = "descripcion_puesto", length = 200, nullable = false)
    private String descripcion_puesto;

    public ExperienciaLaboral() {
    }
    public ExperienciaLaboral(long id_experiencia_laboral, String nombre_empresa, String fecha_inicio, String nombre_fin, String descripcion_puesto) {
        this.id_experiencia_laboral = id_experiencia_laboral;
        this.nombre_empresa = nombre_empresa;
        this.fecha_inicio = fecha_inicio;
        this.nombre_fin = nombre_fin;
        this.descripcion_puesto = descripcion_puesto;
    }         
}
