package com.ec.umg.clase.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiante")

public class Estudiantes {
	
	@GetMapping("/api/demo")
	public String getEstudiante () {
		return "Hola Se utilizo el metodo get " ;
		
	}
	@PutMapping("/api/demo")
	public String putEstudiante () {
		return "Hola Se utilizo el metodo put" ;
		
	}
	@PostMapping("/api/demo")
	public String postEstudiante () {
		return "Hola Se utilizo el metodo Post" ;
		
	}
	
	@DeleteMapping("/api/demo")
	public String deleteEstudiante () {
		return "Hola mundo desde spring usando Delete " ;
		
	}
}
