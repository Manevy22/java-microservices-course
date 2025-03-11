/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CursoMSA.ENVIO.Service;

import com.CursoMSA.ENVIO.Model.Envio;
import com.CursoMSA.ENVIO.Repository.IRepositoryEnvio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Virginia
 */
@Service
public class ServicioEnvio implements IServiceEnvio{
    @Autowired
    private IRepositoryEnvio repo;

    @Override
    public void createEnvio(Envio envio) {
        repo.save(envio);
    }

    @Override
    public List<Envio> traerPedidos(Long idDest) {
        return repo.traerPedidos(idDest);
    }
    
}
