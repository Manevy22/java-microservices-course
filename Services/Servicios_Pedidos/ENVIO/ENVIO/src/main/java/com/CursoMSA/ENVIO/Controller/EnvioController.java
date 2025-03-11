/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CursoMSA.ENVIO.Controller;

import com.CursoMSA.ENVIO.Model.Envio;
import com.CursoMSA.ENVIO.Service.IServiceEnvio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Virginia
 */
@RestController
@RequestMapping("/Envio")
public class EnvioController {
    @Autowired
    private IServiceEnvio servis;
    
    @PostMapping("/createEnvio")
    public ResponseEntity<?> createEnvio(@RequestBody Envio envio){
                try {
            servis.createEnvio(envio);
            return ResponseEntity.status(HttpStatus.OK).body(envio);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
    @GetMapping("/MisPedidos/{idDest}")
    public ResponseEntity<?> consultarPedidos(@PathVariable Long idDest) {
        try {
            List<Envio> pedidos = servis.traerPedidos(idDest);
            if (pedidos != null) {
                return ResponseEntity.status(HttpStatus.OK).body(pedidos);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existen pedidos para el cliente: " + idDest);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
