package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Producto;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IProductoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	private IBodegaService iBodegaService;
	
	@Autowired
	private IProductoService iProductoService;

	@GetMapping("/funciones")
	public String paginaPrinciapal() {
		return "vistaPrincipal";
	}
	
	@GetMapping("/nuevaBodega")
	public String paginaNuevaBodega(Bodega bodega) {
		return "vistaNuevaBodega";
	}
	@PostMapping("/insertarBodega")
	public String insertarBodega(Bodega bodega) {
		this.iBodegaService.agregar(bodega);
		return "vistaGuardado";
	}

	@GetMapping("/nuevoProducto")
	public String paginaNuevoProducto(Producto producto) {

		return "vistaNuevoProducto";
	}
	@PostMapping("/insertarProducto")
	public String insertarProducto(Producto producto) {
		this.iProductoService.agregar(producto);
		return "vistaGuardado";
	}
	

	
//	@PostMapping("/insertar")
//	public String insertarPersona(Persona persona) {
//		this.iPersonaService.guardar(persona);
//		return "guardado";
//	}
//
//	@GetMapping("/buscar")
//	public String buscarTodos(Model modelo) {
//		List<Persona> lista = this.iPersonaService.buscarTodos();
//		modelo.addAttribute("personas", lista);
//		return "vistaListaPersonas";
//	}
//	
//	@DeleteMapping("/borrar/{id}")
//	public String borrarPersona(@PathVariable("id") Integer id) {
//		this.iPersonaService.eliminar(id);
//		return "redirect:/personas/buscar";
//	}
//	@GetMapping("/buscarPorId/{id}")
//	public String buscarPorId(@PathVariable("id") Integer id,Model modelo) {
//		Persona persona=this.iPersonaService.buscarId(id).get(0);
//		modelo.addAttribute("persona",persona);
//		return "vistaPersona";
//	}
//	@PutMapping("/actualizar/{id}")
//	public String actualizar(@PathVariable("id") Integer id,Persona persona) {
//		persona.setId(id);
//		this.iPersonaService.actualizar(persona);
//		return "redirect:/personas/buscar";
//	}
	
}
	