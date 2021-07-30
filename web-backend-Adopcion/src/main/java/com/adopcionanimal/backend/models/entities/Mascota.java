package com.adopcionanimal.backend.models.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mascotas")
public class Mascota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="id_mascota")
	private Integer idMascota;//primary key
	
	@Column(name="nombre_var")
	private String nombre;
	@Column(name="tipo_var")
	private String tipo;
	@Column(name="raza_var")
	private String raza;
	@Column(name="edad_var")
	private String edad;
	@Column(name="tamanio_var")
	private int tamanio;
	@Column(name="genero_var")
	private String genero;
	@Column(name="estado_var")
	private String estado;
	


	public Integer getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Integer idMascota) {
		this.idMascota = idMascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@OneToMany(mappedBy = "mascota",fetch = FetchType.LAZY)
	private List<Cuidados> cuidads;

	
	@OneToOne(mappedBy = "mascota")
	private Adopcion adopcion;
	
	
	
	public Mascota() {
		super();
	}

	public Mascota(Integer idMascota) {
		super();
		this.idMascota = idMascota;
	}
	
	
	
	
	
}
