/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CursoMSA.DESTINATARIO.Repository;

import com.CursoMSA.DESTINATARIO.Model.Envio;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Virginia
 */
@FeignClient(name="destiApi",url="http://localhost:9001/Envio")
public interface IDestinatarioAPI {

    @GetMapping("/MisPedidos/{idDest}")
    public List<Envio> getEnvios(@PathVariable("idDest")  Long idDest);

    
}
