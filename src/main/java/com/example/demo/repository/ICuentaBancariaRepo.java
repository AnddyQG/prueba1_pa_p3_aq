package com.example.demo.repository;

import com.example.demo.modelo.CuantaBancaria;

public interface ICuentaBancariaRepo {
 
	
	public void insertar(CuantaBancaria bancaria);
	
	public void actualizar(CuantaBancaria bancaria);
	
	public void eliminar(Integer id);
	public CuantaBancaria buscar(Integer id);
	
	
}
