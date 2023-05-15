package com.example.ArgPrograma.services;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ArgPrograma.models.Proyecto;
import com.example.ArgPrograma.repositories.ProyectoRepository;

@Service
public class ProyectoService {
	@Autowired
	ProyectoRepository proyectorepository;

	public ArrayList<Proyecto> obtenerProyectos() {
		return (ArrayList<Proyecto>) proyectorepository.findAll();
	}
	
	public Proyecto obtenerProyectoById(Long id) {
		Proyecto proyectoEncontrado = proyectorepository.findById(id).orElse(null);
		return proyectoEncontrado;
	}

	public Proyecto agregarProyecto(Proyecto proyecto) {
		return proyectorepository.save(proyecto);

	}

	public Proyecto editarProyecto(Proyecto proyecto) {
		Long id = proyecto.getId();
		String nombre = proyecto.getNombre();
		String descripcion = proyecto.getDescripcion();
		String link = proyecto.getLink();
		Date fechaInicio = proyecto.getFechaInicio();
		Proyecto proy = obtenerProyectoById(id);
		
		System.out.println(proyecto);

		if (proy != null) {
			
			if(nombre != null) {
				proy.setNombre(nombre);
			}
			
			if(descripcion != null) {
				proy.setDescripcion(descripcion);
			}
			
			if(link != null) {
				proy.setLink(link);
			}
			
			if(fechaInicio != null) {
				proy.setFechaInicio(fechaInicio);
			}
			
		
			}
		return proyectorepository.save(proy);
	}
 
}