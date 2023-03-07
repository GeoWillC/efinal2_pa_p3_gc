package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Bodega;

public interface IBodegaRepo {
	public void insertar (Bodega bodega);
	public List<Bodega> buscar(Integer numeroBodega);
}
