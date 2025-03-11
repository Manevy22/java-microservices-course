/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CursoMSA.DESTINATARIO.Controller;

import com.CursoMSA.DESTINATARIO.Model.Destinatario;
import com.CursoMSA.DESTINATARIO.Model.Envio;
import com.CursoMSA.DESTINATARIO.Service.IServiceDestinatario;
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
@RequestMapping("/Destinatario")
public class DestinatarioController {
    @Autowired
    private IServiceDestinatario servis;
    
    @PostMapping("/createDestinatario")
    public ResponseEntity<?> createDest(@RequestBody Destinatario destinatario){
                try {
            servis.createDestinatario(destinatario);
            return ResponseEntity.status(HttpStatus.OK).body(destinatario);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
    @GetMapping("/MisPedidos/{idDest}")
    public ResponseEntity<?> consultarPedidos(@PathVariable Long idDest) {
        try {
            List<Envio> pedidos = servis.traerEnvios(idDest);
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
