package com.workspace.sgd.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.workspace.sgd.entity.Usuario;
import com.workspace.sgd.repository.RepositoryUsuario;


@Service
@AllArgsConstructor
public class ServiceImplUsuario implements ServiceUsuario{
	
	private final RepositoryUsuario repositoryUsuario;


    @Override
	public Usuario BuscarUsuario(Long idUsuario) {
		// TODO Auto-generated method stub
		return repositoryUsuario.findById(idUsuario).orElseThrow(()->{throw new RuntimeException();});
	}
	
	
	
}
