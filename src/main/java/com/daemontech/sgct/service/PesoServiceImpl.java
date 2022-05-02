package com.daemontech.sgct.service;

import com.daemontech.sgct.entity.Enfermedad;
import com.daemontech.sgct.entity.Peso;
import com.daemontech.sgct.repository.EnfermedadRepository;
import com.daemontech.sgct.repository.PesoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PesoServiceImpl implements PesoService {
	
	@Autowired
	private PesoRepository pesoRepository;

	@Override
	public void guardar(Peso peso) {
		pesoRepository.save(peso);
	}

	@Override
	public List<Peso> obtenerTodosLosPesos() {
		return pesoRepository.findAll();
	}


	@Override
	public Optional<Peso> obtenerPeso(Integer id) {
		return pesoRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {

		pesoRepository.deleteById(id);
	}

}
