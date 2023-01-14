package com.example.demo.repository;

import com.example.demo.modelo.CuantaBancaria;
import com.example.demo.modelo.Transferencia;

public interface ITransferenciaRepo {

	public void insertar(Transferencia transferencia);
	
	
	
	public void buscar(Integer id);
	
}
