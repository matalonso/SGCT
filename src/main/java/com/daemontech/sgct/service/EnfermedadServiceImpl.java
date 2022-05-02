package com.daemontech.sgct.service;

import com.daemontech.sgct.entity.Enfermedad;
import com.daemontech.sgct.repository.EnfermedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EnfermedadServiceImpl implements EnfermedadService {
	
	@Autowired
	private EnfermedadRepository enfermedadRepository;

	@Override
	public void guardar(Enfermedad enfermedad) {
		enfermedadRepository.save(enfermedad);
	}

	@Override
	public List<Enfermedad> obtenerTodasLasEnfermedades() {
		return enfermedadRepository.findAll();
	}


	@Override
	public Optional<Enfermedad> obtenerEnfermedad(Integer id) {
		return enfermedadRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {

		enfermedadRepository.deleteById(id);
	}

}
