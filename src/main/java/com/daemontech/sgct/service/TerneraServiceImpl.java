package com.daemontech.sgct.service;

import java.util.List;
import java.util.Optional;

import com.daemontech.sgct.entity.Ternera;
import com.daemontech.sgct.repository.TerneraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class TerneraServiceImpl implements TerneraService {
	
	@Autowired
	private TerneraRepository terneraRepository;

	@Override
	public void guardar(Ternera ternera) {
		terneraRepository.save(ternera);
	}

	@Override
	public List<Ternera> obtenerTodasLasTerneras() {
		return terneraRepository.findAll();
	}


	@Override
	public Optional<Ternera> obtenerTernera(Integer id) {
		return terneraRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {

		terneraRepository.deleteById(id);
	}

}
