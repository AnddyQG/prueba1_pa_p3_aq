package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name= "cuentadebanco")


public class CuantaBancaria {
	@Id
	
		
	
		@Column(name="cb_numero")
		private String id;
		
		
		@Column(name="cb_corriente")
		private String Cbcorriente;
		
		@Column(name="cb_ahorros")
		private String Cbahorros;
		
		@Column(name="cb_saldo")
		private String cb_saldo;
		
		@Column(name="cb_cedula")
		private String Ccedula;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCbcorriente() {
			return Cbcorriente;
		}

		public void setCbcorriente(String cbcorriente) {
			Cbcorriente = cbcorriente;
		}

		public String getCbahorros() {
			return Cbahorros;
		}

		public void setCbahorros(String cbahorros) {
			Cbahorros = cbahorros;
		}

		public String getCb_saldo() {
			return cb_saldo;
		}

		public void setCb_saldo(String cb_saldo) {
			this.cb_saldo = cb_saldo;
		}

		public String getCcedula() {
			return Ccedula;
		}

		public void setCcedula(String ccedula) {
			Ccedula = ccedula;
		}
		
		
		
		  
}
