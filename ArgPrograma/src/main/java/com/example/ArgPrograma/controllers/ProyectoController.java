package com.example.ArgPrograma.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ArgPrograma.models.Proyecto;
import com.example.ArgPrograma.services.ProyectoService;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
	@Autowired
	ProyectoService proyectoService;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/obtenerUProyectos")
	public ArrayList<Proyecto> obtenerProyectos() {
		return proyectoService.obtenerProyectos();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/agregarProyecto")
	public Proyecto agregarProyecto(@RequestBody Proyecto proyecto) {
		return proyectoService.agregarProyecto(proyecto);
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("/editarProyecto")
	public Proyecto editarProyecto(@RequestBody Proyecto proyecto) {
		return proyectoService.editarProyecto(proyecto);
	}
	
}