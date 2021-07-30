package com.adopcionanimal.backend.models.entities;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cuidados")
public class Cuidados {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Basic(optional=false)
				
		@Column(name="id_cuidados")
		private Integer id_cuidados;
		
		@Column(name="descripcion")
		private String descripcion;
		@Column(name="vacuna")
		private String vacuna;
		@Column(name="medicamentos")
		private String medicamentos;
		@Column(name="fecha")
		private Calendar fecha;
		
		public Integer getId_cuidados() {
			return id_cuidados;
		}
		public void setId_cuidados(Integer id_cuidados) {
			this.id_cuidados = id_cuidados;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getVacuna() {
			return vacuna;
		}
		public void setVacuna(String vacuna) {
			this.vacuna = vacuna;
		}
		public String getMedicamentos() {
			return medicamentos;
		}
		public void setMedicamentos(String medicamentos) {
			this.medicamentos = medicamentos;
		}
		public Calendar getFecha() {
			return fecha;
		}
		public void setFecha(Calendar fecha) {
			this.fecha = fecha;
		}
		
		
		
		@JoinColumn(name="id_mascota",referencedColumnName = "id_mascota")//se mapea una clave foranea
		@ManyToOne
		
		private Mascota mascota;
		
		
		
		public Mascota getMascota() {
			return mascota;
		}
		public void setMascota(Mascota mascota) {
			this.mascota = mascota;
		}
		
		
		@JoinColumn(name="id_cuidados",nullable=false)
		@OneToOne(fetch = FetchType.LAZY)
		private Rescatista rescatista;
		
		
		
		public Cuidados() {
			super();
		}
		public Cuidados(Integer id_cuidados) {
			super();
			this.id_cuidados = id_cuidados;
		}
		
		
		
		
		
}
