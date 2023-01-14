package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "transferencia")
public class Transferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cb_seq")
	@SequenceGenerator(name = "cb_seq",sequenceName = "cb_seq",allocationSize = 1)
	
	
	@Column(name="ts_id")
	private Integer id;
	@Column(name="ts_fecha")
	private String fecha;
	@Column(name="ts_ncorigen")
	private String ncorigen;
	@Column(name="ts_ncdestino")
	private String ncdestino;
	@Column(name="ts_monto")
	private Double monto;
	@Column(name="ts_comision")
	private String comision;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNcorigen() {
		return ncorigen;
	}
	public void setNcorigen(String ncorigen) {
		this.ncorigen = ncorigen;
	}
	public String getNcdestino() {
		return ncdestino;
	}
	public void setNcdestino(String ncdestino) {
		this.ncdestino = ncdestino;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	
}
