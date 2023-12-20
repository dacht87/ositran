package com.workspace.sgd.service;

import com.workspace.sgd.entity.Bandeja;
import com.workspace.sgd.repository.RepositoryBandeja;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceImplBandeja implements ServiceBandeja{

    private final RepositoryBandeja repositoryBandeja;

    @Override
    public List<Bandeja> ListarBandeja(String PROPIETARIO) {

        return repositoryBandeja.findByPROPIETARIO(PROPIETARIO);
    }
}
