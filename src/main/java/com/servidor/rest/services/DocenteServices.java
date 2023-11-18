package com.servidor.rest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.servidor.rest.entity.Docente;
import com.servidor.rest.repository.DocenteRepository;

@Service
public class DocenteServices {
	@Autowired
	private DocenteRepository repo;
	
	public List<Docente> listarDocente(){
		return repo.findAll();
	}
	public void registrar(Docente bean) {
		repo.save(bean);
	}
	public void actualizar(Docente bean) {
		repo.save(bean);
	}
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	public Docente buscarPorCodigo(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
}





