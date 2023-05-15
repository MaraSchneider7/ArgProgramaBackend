package com.example.ArgPrograma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ArgPrograma.services.UsuarioService;

@SpringBootApplication
public class ArgProgramaApplication {

	UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(ArgProgramaApplication.class, args); 
	}
}
