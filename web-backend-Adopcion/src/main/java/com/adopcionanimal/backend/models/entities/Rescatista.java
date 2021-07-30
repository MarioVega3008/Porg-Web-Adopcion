package com.adopcionanimal.backend.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Rescatistas")
public class Rescatista extends Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	
	@Column(name="id_rescatista")
	private Long idRescatista;
	@Column(name="licencia")
	private String licencia;
	@Column(name="especialidad")
	private String especialidad;
	
	
	
	public Long getIdRescatista() {
		return idRescatista;
	}


	public void setIdRescatista(Long idRescatista) {
		this.idRescatista = idRescatista;
	}


	public String getLicencia() {
		return licencia;
	}


	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	@OneToOne(mappedBy = "rescatista")
	private Cuidados cuidados;
	
	
	
	
	public Rescatista(Long idRescatista) {
		super();
		this.idRescatista = idRescatista;
	}


	public Rescatista() {
		super();
	}
	
	
	
	

}
