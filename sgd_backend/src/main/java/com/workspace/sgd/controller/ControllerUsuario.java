package com.workspace.sgd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workspace.sgd.service.ServiceUsuario;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class ControllerUsuario {
	
	
	private final ServiceUsuario serviceUsuario;

    @GetMapping("/{id}")
	public ResponseEntity ObtenerUsuario(@PathVariable("id") Long idUsuario) {
		return new ResponseEntity(serviceUsuario.BuscarUsuario(idUsuario),HttpStatus.OK);
	}
}
