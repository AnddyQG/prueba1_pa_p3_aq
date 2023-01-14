package com.example.demo.repository;

import org.springframework.stereotype.Repository;


import com.example.demo.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class TransferenciaRepositoryImpl implements ITransferenciaRepo{
	
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void buscar(Integer id) {
		this.entityManager.find(this.getClass(), id);
		
	}

	@Override
	public void insertar(Transferencia transferencia) {
		this.entityManager.persist(transferencia);
		
	}

}
