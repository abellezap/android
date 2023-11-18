package com.servidor.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.servidor.rest.entity.Docente;
import com.servidor.rest.services.DocenteServices;

@CrossOrigin
@RestController
@RequestMapping("/docente")
public class DocenteController {
	@Autowired
	private DocenteServices servicioDoc;

	@GetMapping("/lista")
	public List<Docente> lista(){
		return servicioDoc.listarDocente();
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Docente doc){
		servicioDoc.registrar(doc);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Docente doc){
		servicioDoc.actualizar(doc);
	}
	@DeleteMapping("/eliminar/{codi}")
	public void eliminarPorCodigo(@PathVariable("codi") Integer cod){
		servicioDoc.eliminar(cod);
	}
	@GetMapping("/buscar/{codi}")
	public Docente buscar(@PathVariable("codi") Integer cod){
		return servicioDoc.buscarPorCodigo(cod);
	}
	
}







