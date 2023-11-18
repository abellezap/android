package com.servidor.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servidor.rest.entity.Distrito;
import com.servidor.rest.repository.DistritoRepository;

@Service
public class DistritoServices {
	@Autowired
	private DistritoRepository repo;
	
	public List<Distrito> listarDistritos(){
		return repo.findAll();
	}
	
	
}
