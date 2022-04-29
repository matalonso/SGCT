package com.daemontech.sgct.service;

import com.daemontech.sgct.entity.Guachera;
import com.daemontech.sgct.repository.GuacheraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GuacheraServiceImpl implements GuacheraService {
	
	@Autowired
	private GuacheraRepository guacheraRepository;

	@Override
	public void guardar(Guachera guachera) {
		guacheraRepository.save(guachera);
	}

	@Override
	public List<Guachera> obtenerTodasLasGuacheras() {
		return guacheraRepository.findAll();
	}


	@Override
	public Optional<Guachera> obtenerGuachera(Integer id) {
		return guacheraRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {

		guacheraRepository.deleteById(id);
	}

}
