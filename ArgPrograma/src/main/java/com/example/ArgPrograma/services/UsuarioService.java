package com.example.ArgPrograma.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ArgPrograma.models.Usuario;
import com.example.ArgPrograma.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuariorepository;

	public ArrayList<Usuario> obtenerUsuarios() {
		return (ArrayList<Usuario>) usuariorepository.findAll();
	}
	
	public Usuario obtenerUsuarioById(Long id) {
		Usuario usuarioEncontrado = usuariorepository.findById(id).orElse(null);
		return usuarioEncontrado;
	}

	public Usuario agregarUsuario(Usuario usuario) {
		return usuariorepository.save(usuario);

	}

	public Usuario editarUsuario(Usuario usuario) {
		Long id = usuario.getId();
		String nombre = usuario.getNombre();
		String apellido = usuario.getApellido();
		String tituloProfesional = usuario.getTituloProfesional();
		String descripcionTituloProfesional = usuario.getDescripcionTituloProfesional();
		String linkedin = usuario.getLinkedin();
		String github = usuario.getGithub();
		String infoSobreUsuario = usuario.getInfoSobreUsuario();
		String experienciaLaboral = usuario.getExperienciaLaboral();
		String educacion = usuario.getEducacion();
		String email = usuario.getEmail();
		String password = usuario.getPassword();
		Boolean sesion = usuario.getSesion();
		Usuario user = obtenerUsuarioById(id);
		
		System.out.println(usuario);

		if (user != null) {
			
			if(nombre != null) {
				user.setNombre(nombre);
			}
			
			if(apellido != null) {
				user.setApellido(apellido);
			}
			
			if(tituloProfesional != null) {
				user.setTituloProfesional(tituloProfesional);
			}
			
			if(descripcionTituloProfesional != null) {
				user.setDescripcionTituloProfesional(descripcionTituloProfesional);
			}
			
			if(linkedin != null) {
				user.setLinkedin(linkedin);
			}
			
			if(github != null) {
				user.setGithub(github);
			}
			
			if(infoSobreUsuario != null) {
				user.setInfoSobreUsuario(infoSobreUsuario);
			}
			
			if(experienciaLaboral != null) {
				user.setExperienciaLaboral(experienciaLaboral);
			}
			
			if(educacion != null) {
				user.setEducacion(educacion);
			}
			
			if(email != null) {
				user.setEmail(email);
			}
			
			if(password != null) {
				user.setPassword(password);
			}
			
			if(sesion != null) {
				user.setSesion(sesion);
			}
		
			}
		return usuariorepository.save(user);
	}
 
}