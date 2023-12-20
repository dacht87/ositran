package com.workspace.sgd.repository;

import com.workspace.sgd.entity.Bandeja;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBandeja extends JpaRepository<Bandeja,String> {
    List<Bandeja> findByPROPIETARIO(String Propietario);
}
