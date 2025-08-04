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
	
	@GetMapping("/get")
	public String getEstudiante () {
		return "Hola Se utilizo el metodo get " ;
		
	}
	@PutMapping("/put")
	public String putEstudiante () {
		return "Hola Se utilizo el metodo put" ;
		
	}
	@PostMapping("/post")
	public String postEstudiante () {
		return "Hola Se utilizo el metodo Post" ;
		
	}
	
	@DeleteMapping("/delete")
	public String deleteEstudiante () {
		return "Hola mundo desde spring usando Delete " ;
		
	}
}
