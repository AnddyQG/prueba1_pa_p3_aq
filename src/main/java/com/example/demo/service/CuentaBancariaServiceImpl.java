package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CuantaBancaria;
@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
@Autowired 
private ICuentaBancariaService bancariaService;
	@Override
	public void insertar(CuantaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.bancariaService.insertar(bancaria);
	}

	@Override
	public void actualizar(CuantaBancaria bancaria) {
	this.bancariaService.actualizar(bancaria);
	}

	@Override
	public void eliminar(CuantaBancaria bancaria) {
	this.bancariaService.eliminar(bancaria);
	}

	@Override
	public void buscar(CuantaBancaria bancaria) {
		this.bancariaService.buscar(bancaria);
		
	}

	
	/*
	 


    }


	 
	 */
	
}
