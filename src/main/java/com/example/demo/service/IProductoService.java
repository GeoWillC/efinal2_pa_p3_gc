package com.example.demo.service;

import com.example.demo.modelo.Producto;

public interface IProductoService {
	public void agregar(Producto producto);
	public Producto buscarCodigoMaestro(Integer codigoMaestro); 
}
