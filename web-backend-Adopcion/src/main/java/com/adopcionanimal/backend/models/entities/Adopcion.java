package com.adopcionanimal.backend.models.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Adopcion")
public class Adopcion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
		
		@Column(name="id_adopcion")
		private Integer id_adopcion;//primary key
		
		@Column(name="codigo_var")
		private String codigo;
		@Column(name="fecha_var")
		private Calendar fecha;
		@Column(name="descripcion_var")
		private String descripcion;
		
		
		public Integer getId_adopcion() {
			return id_adopcion;
		}
		public void setId_adopcion(Integer id_adopcion) {
			this.id_adopcion = id_adopcion;
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		
		public Calendar getFecha() {
			return fecha;
		}
		public void setFecha(Calendar fecha) {
			this.fecha = fecha;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		
		
		@OneToMany(mappedBy = "adopcion",fetch = FetchType.LAZY)
		private List<Condicion> condicions;
		
		@JoinColumn(name="id_mascota",nullable=false)
		@OneToOne(fetch = FetchType.LAZY)
		private Mascota mascota;
		
		
		@JoinColumn(name="id_NuevoPropietario",nullable=false)
		@OneToOne(fetch = FetchType.LAZY)
		private NuevoPropietario nuevopropietario;
		
		
		
		public Mascota getMascota() {
			return mascota;
		}
		public void setMascota(Mascota mascota) {
			this.mascota = mascota;
		}
		
		
		public NuevoPropietario getNuevopropietario() {
			return nuevopropietario;
		}
		public void setNuevopropietario(NuevoPropietario nuevopropietario) {
			this.nuevopropietario = nuevopropietario;
		}
		
		public Adopcion() {
			super();
		}
		public Adopcion(Integer id_adopcion) {
			super();
			this.id_adopcion = id_adopcion;
		}
		
		
		
		
		
}
