package com.adopcionanimal.backend.models.entities;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Condiciones")
public class Condicion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
			
	@Column(name="id_condicion")
	private Integer idCondicion;
	
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="tipo")
	private String tipo;
	@Column(name="fecha")
	private Calendar fecha;
	

	
	public Integer getIdCondicion() {
		return idCondicion;
	}
	public void setIdCondicion(Integer idCondicion) {
		this.idCondicion = idCondicion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}


	
	
	
	@JoinColumn(name="id_adopcion",referencedColumnName = "id_adopcion")//se mapea una clave foranea
	@ManyToOne
	private Adopcion adopcion;
	
	
	
	public Adopcion getAdopcion() {
		return adopcion;
	}
	public void setAdopcion(Adopcion adopcion) {
		this.adopcion = adopcion;
	}
	
	
	
	
	public Condicion() {
		super();
	}
	public Condicion(Integer idCondicion) {
		super();
		this.idCondicion = idCondicion;
	}
	

	
	
	
	
}
