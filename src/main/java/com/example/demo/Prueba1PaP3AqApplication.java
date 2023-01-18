package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.correcion.modelo.Cuenta;
import com.example.demo.correcion.service.ICuentaService;
import com.example.demo.correcion.service.ITransferenciaService;

@SpringBootApplication
public class Prueba1PaP3AqApplication implements CommandLineRunner{
@Autowired
	private ICuentaService cuentaService;
	@Autowired
	private ITransferenciaService iTransferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3AqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cuenta cuentaOrigen= new Cuenta();
		/*
		cuentaOrigen.setNumero("124");
		cuentaOrigen.setTipo("A");
		cuentaOrigen.setSaldo(new BigDecimal(100));
		cuentaOrigen.setCedulaPropietario("17245686778");
		this.cuentaService.guardar(cuentaOrigen);
		*/
		Cuenta cuentaDestino= new Cuenta();
		/*
		cuentaDestino.setNumero("125");
		cuentaDestino.setTipo("C");
		cuentaDestino.setSaldo(new BigDecimal(100));
		cuentaDestino.setCedulaPropietario("17245686778");
		this.cuentaService.guardar(cuentaDestino);
		this.iTransferenciaService.realizar("124", "125", new BigDecimal(10));
		*/
		this.iTransferenciaService.realizar("125", "124", new BigDecimal(10));
		System.out.println(cuentaOrigen.getSaldo());
		System.out.println();
		System.out.println(this.cuentaService.encontrar("124"));
	}

}
