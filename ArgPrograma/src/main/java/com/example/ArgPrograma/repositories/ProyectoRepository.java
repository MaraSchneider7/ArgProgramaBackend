package com.example.ArgPrograma.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ArgPrograma.models.Proyecto;

@Repository
public interface ProyectoRepository extends CrudRepository<Proyecto, Long> {
	
	
}