package com.workspace.sgd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.workspace.sgd.entity.Usuario;


public interface RepositoryUsuario extends JpaRepository<Usuario,Long> {
	
}
