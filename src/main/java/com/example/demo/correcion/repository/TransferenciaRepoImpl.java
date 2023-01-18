package com.example.demo.correcion.repository;

import org.springframework.stereotype.Repository;



import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class TransferenciaRepoImpl implements ITransferenciaRepo{
@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(com.example.demo.correcion.modelo.Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);
	}

}
