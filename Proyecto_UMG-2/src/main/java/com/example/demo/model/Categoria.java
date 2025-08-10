// Categoria.java
package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre1() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
	public String getNombre() {
	// TODO Auto-generated method stub
		return null;
	}
}
