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
@Table(name="DatosPersonales")
public class DatosPersonales {
      @Id
      @Column(name = "id_datosPersonales")
      @GeneratedValue(strategy = GenerationType.AUTO)
      private long id_datosPersonales;
      
    
      @Column(name = "nombre", length = 45, nullable = false)
      private String nombre;
      @Column(name = "apellido", length = 45, nullable = false)
      private String apellido;
      @Column(name = "fecha_nacimiento ", length = 45, nullable = false)
      private String fecha_nacimiento;
      @Column(name = "estado_civil", length = 45, nullable = false)
      private String estado_civil;
      @Column(name = "correo_electronico", length = 45, nullable = false)
      private String correo_electronico;

      public DatosPersonales() {
      }
    public DatosPersonales(long id_datosPersonales, String nombre, String apellido, String fecha_nacimiento, String estado_civil, String correo_electronico) {
        this.id_datosPersonales = id_datosPersonales;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado_civil = estado_civil;
        this.correo_electronico = correo_electronico;
    }          
}


