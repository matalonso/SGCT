package com.daemontech.sgct.restController;

import com.daemontech.sgct.entity.Guachera;
import com.daemontech.sgct.service.GuacheraService;
import com.daemontech.sgct.service.GuacheraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/Guacheras")
class GuacheraRest {

	@Autowired
	private GuacheraService guacheraService;

	@PostMapping("/Guardar")
	public void Guardar(@RequestBody Guachera guachera) {
		guacheraService.guardar(guachera);


	}

	@GetMapping("/Listar")
	public List<Guachera> Listar(){
		return guacheraService.obtenerTodasLasGuacheras();
	}

	@DeleteMapping("/Eliminar/{id}")
	public void Eliminar(@PathVariable("id") Integer id){
		guacheraService.eliminar(id);
	}

	@PostMapping("/Actualizar")
	public void Actualizar(@RequestBody Guachera guachera) {
		guacheraService.guardar(guachera);

	}

}








