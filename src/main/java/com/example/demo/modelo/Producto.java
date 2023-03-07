package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	@Id
	@Column(name="prod_codigo_barras_maestro")
	private Integer codigoBarrasMaestro;
	@Column(name="prod_nombre")
	private String nombre;
	@Column(name="prod_categoria")
	private String categoria;
	@Column(name="prod_stock")
	private Integer stock;
	
	@OneToMany(mappedBy = "producto")
	private List<Inventario> inventario;

	public Integer getCodigoBarrasMaestro() {
		return codigoBarrasMaestro;
	}
	public void setCodigoBarrasMaestro(Integer codigoBarrasMaestro) {
		this.codigoBarrasMaestro = codigoBarrasMaestro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public List<Inventario> getInventario() {
		return inventario;
	}
	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
