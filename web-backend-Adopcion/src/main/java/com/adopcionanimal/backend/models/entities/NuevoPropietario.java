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
@Table(name="Nuevos_Propietarios")
public class NuevoPropietario extends Persona {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Basic(optional=false)
		
		@Column(name="id_NuevoPropietario")
		private Long id_NuevoPropietario;
		@Column(name="carisma")
		private String carisma;
		@Column(name="disponibilidad")
		private String disponibilidad;
		
		
		
		public Long getId_NuevoPropietario() {
			return id_NuevoPropietario;
		}

		public void setId_NuevoPropietario(Long id_NuevoPropietario) {
			this.id_NuevoPropietario = id_NuevoPropietario;
		}

		public String getCarisma() {
			return carisma;
		}

		public void setCarisma(String carisma) {
			this.carisma = carisma;
		}

		public String getDisponibilidad() {
			return disponibilidad;
		}

		public void setDisponibilidad(String disponibilidad) {
			this.disponibilidad = disponibilidad;
		}

		public Adopcion getAdopcion() {
			return adopcion;
		}

		public void setAdopcion(Adopcion adopcion) {
			this.adopcion = adopcion;
		}

		@OneToOne(mappedBy = "nuevopropietario")
		private Adopcion adopcion;
		
		
		
		
		public NuevoPropietario(Long id_NuevoPropietario) {
			super();
			this.id_NuevoPropietario = id_NuevoPropietario;
		}

		public NuevoPropietario() {
			super();
		}

		
}
