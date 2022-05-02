package com.daemontech.sgct.restController;

import com.daemontech.sgct.entity.Enfermedad;
import com.daemontech.sgct.entity.Guachera;
import com.daemontech.sgct.service.EnfermedadService;
import com.daemontech.sgct.service.GuacheraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/Enfermedades")
class EnfermedadRest {

	@Autowired
	private EnfermedadService enfermedadService;


	@PostMapping("/Guardar")
	public void Guardar(@RequestBody Enfermedad enfermedad) {

		enfermedadService.guardar(enfermedad);

	}

	@GetMapping("/Listar")
	public List<Enfermedad> Listar(){

		return enfermedadService.obtenerTodasLasEnfermedades();
	}

	@DeleteMapping("/Eliminar/{id}")
	public void Eliminar(@PathVariable("id") Integer id)
	{
		enfermedadService.eliminar(id);

	}

	@PostMapping("/Actualizar")
	public void Actualizar(@RequestBody Enfermedad enfermedad) {
		enfermedadService.guardar(enfermedad);

	}

}








