package com.servidor.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servidor.rest.entity.Distrito;
import com.servidor.rest.services.DistritoServices;

@CrossOrigin
@RestController
@RequestMapping("/distrito")
public class DistritoController {
	@Autowired
	private DistritoServices servicioDis;
	
	//listar distritos JSON
	@GetMapping("/lista")
	public List<Distrito> lista(){
		return servicioDis.listarDistritos();
	}
	
}
