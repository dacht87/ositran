package com.workspace.sgd.controller;

import com.workspace.sgd.service.ServiceBandeja;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bandeja")
@RequiredArgsConstructor
public class ControllerBandeja {
    private final ServiceBandeja serviceBandeja;


    @GetMapping("/{id}")
    public ResponseEntity ObtenerBandeja(@PathVariable("id") String Propietario){
        return new ResponseEntity(serviceBandeja.ListarBandeja(Propietario), HttpStatus.OK);
    }
}
