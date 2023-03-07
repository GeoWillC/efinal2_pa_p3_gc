package com.example.demo.service;

public interface IInventarioService {
	public void insertar(Integer numeroBodega,Integer codigoMaestro,Integer cantidad);
	public String codigoIndividual(Integer codigoMaestro,Integer secuencial);
}
