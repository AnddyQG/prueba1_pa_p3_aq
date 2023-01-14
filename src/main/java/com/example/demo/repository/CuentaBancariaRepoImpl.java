package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CuantaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional

public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo{





	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CuantaBancaria bancaria) {
		
		this.entityManager.persist(bancaria);
		
	}

	@Override
	public void actualizar(CuantaBancaria bancaria) {
		this.entityManager.merge(bancaria);
		
	}

	@Override
	public CuantaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuantaBancaria.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		CuantaBancaria cueb = this.buscar(id);
		this.entityManager.remove(cueb);
	/*
	 
	
		
	}
	 
	 */
	
}
	
		
	}

