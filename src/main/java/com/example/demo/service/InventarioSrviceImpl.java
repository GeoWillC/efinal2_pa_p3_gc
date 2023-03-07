package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;
import com.example.demo.repository.IBodegaRepo;
import com.example.demo.repository.IProductoRepo;

public class InventarioSrviceImpl implements IInventarioService {

	@Autowired
	private IBodegaRepo iBodegaRepo;
	@Autowired
	private IProductoRepo iProductoRepo;

	@Override
	public void insertar(Integer numeroBodega, Integer codigoMaestro,Integer cantidad) {
		// TODO Auto-generated method stub
		Bodega bodega=this.iBodegaRepo.buscar(numeroBodega).get(0);
		Producto producto=this.iProductoRepo.buscarCodigoMaestro(codigoMaestro);
		Inventario inventario=new Inventario();
		inventario.setBodega(bodega);
		inventario.setProducto(producto);
		inventario.setCantidad(cantidad);
		String codigo=codigoIndividual(codigoMaestro, bodega.getSecuencial());
		inventario.setCodigoBarrasIndividual(codigo);
		
	}
	@Override
	public String codigoIndividual(Integer codigoMaestro, Integer secuencial) {
		String codigoConcatenado=codigoMaestro+":"+secuencial;
		return codigoConcatenado;
	}
	
}
