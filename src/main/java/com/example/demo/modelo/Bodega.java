package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="bodega")
public class Bodega {
	//Id es el numero
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bode_sec")
	@SequenceGenerator(name = "bode_sec", sequenceName = "bode_sec", allocationSize = 1)
	@Column(name = "bode_secuencial")
	private Integer secuencial;
	@Column(name = "bode_numero")
	private Integer numero;
	@Column(name="bode_nombre")
	private String nombre;
	@Column(name = "bode_direccion")
	private String direccion;
	@Column(name = "bode_telefono")
	private String telefono;
	@OneToMany(mappedBy = "bodega")
	private List<Inventario> inventario;
	public Integer getSecuencial() {
		return secuencial;
	}
	public void setSecuencial(Integer secuencial) {
		this.secuencial = secuencial;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Inventario> getInventario() {
		return inventario;
	}
	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}
	
}
