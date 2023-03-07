package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class BodegaRepoImpl implements IBodegaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(bodega);
	}

	@Override
	public List<Bodega> buscar(Integer numeroBodega) {
		TypedQuery<Bodega> myQuery=this.entityManager.createQuery("select b from Bodega b where b.numero=:numeroBodega",Bodega.class);
		myQuery.setParameter("numeroBodega", numeroBodega);
		return myQuery.getResultList();
	}
}
