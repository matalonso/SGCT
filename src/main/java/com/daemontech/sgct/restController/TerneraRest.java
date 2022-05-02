package com.daemontech.sgct.restController;

import com.daemontech.sgct.entity.Ternera;
import com.daemontech.sgct.service.TerneraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terneras")
class TerneraRest {

	@Autowired
	private TerneraService terneraService;

	@PostMapping("/Guardar")
	public void Guardar(@RequestBody Ternera ternera) {
		terneraService.guardar(ternera);


	}

	@GetMapping("/Listar")
	public List<Ternera> Listar(){

		return terneraService.obtenerTodasLasTerneras();
	}

	@DeleteMapping("/Eliminar/{id}")
	public void Eliminar(@PathVariable("id") Integer id){
		terneraService.eliminar(id);
	}

	@PostMapping("/Actualizar")
	public void Actualizar(@RequestBody Ternera ternera) {
		terneraService.guardar(ternera);

	}

}








