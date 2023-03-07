package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="inventario")
public class Inventario {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deta_sec")
	@SequenceGenerator(name = "deta_sec", sequenceName = "deta_sec", allocationSize = 1)
	@Column(name="inve_codigo_barras-individual")
	private String codigoBarrasIndividual;
	
	@Column(name="inve_cantidad")
	private Integer cantidad;
	
	@ManyToOne
	@JoinColumn(name="inve_id_producto")
	private Producto producto;
	@ManyToOne
	@JoinColumn(name="inve_id_bodega")
	private Bodega bodega;
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Bodega getBodega() {
		return bodega;
	}
	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}
	public String getCodigoBarrasIndividual() {
		return codigoBarrasIndividual;
	}
	public void setCodigoBarrasIndividual(String codigoBarrasIndividual) {
		this.codigoBarrasIndividual = codigoBarrasIndividual;
	}
	
	
}
