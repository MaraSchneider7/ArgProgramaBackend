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

import com.example.ArgPrograma.models.Usuario;
import com.example.ArgPrograma.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/obtenerUsuario")
	public ArrayList<Usuario> obtenerUsuario() {
		return usuarioService.obtenerUsuarios();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/agregarUsuario")
	public Usuario agregarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.agregarUsuario(usuario);
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("/editarUsuario")
	public Usuario editarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.editarUsuario(usuario);
	}
	
}