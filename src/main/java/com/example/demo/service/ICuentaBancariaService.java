package com.example.demo.service;

import com.example.demo.modelo.CuantaBancaria;

public interface ICuentaBancariaService {

	public void insertar(CuantaBancaria bancaria);
	
	public void actualizar(CuantaBancaria bancaria);
	
	public void eliminar(CuantaBancaria bancaria);
	public void buscar(CuantaBancaria bancaria);
	
	
}
