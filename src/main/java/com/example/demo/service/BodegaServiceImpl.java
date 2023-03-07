package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodega;
import com.example.demo.repository.IBodegaRepo;

@Service
public class BodegaServiceImpl implements IBodegaService{

	@Autowired
	private IBodegaRepo iBodegaRepo;
	
	@Override
	public void agregar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.iBodegaRepo.insertar(bodega);
	}

	@Override
	public List<Bodega> encontrar(Integer numeroBodega) {
		// TODO Auto-generated method stub
		return this.iBodegaRepo.buscar(numeroBodega);
	}

}
