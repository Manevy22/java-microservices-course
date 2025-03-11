/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CursoMSA.DESTINATARIO.Service;

import com.CursoMSA.DESTINATARIO.Model.Destinatario;
import com.CursoMSA.DESTINATARIO.Model.Envio;
import com.CursoMSA.DESTINATARIO.Repository.IDestinatarioAPI;
import com.CursoMSA.DESTINATARIO.Repository.IRepositoryDestinatario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Virginia
 */
@Service
public class ServiceDestinatario implements IServiceDestinatario{
    @Autowired 
    private IRepositoryDestinatario repo;
    @Autowired
    private IDestinatarioAPI repo_dest;

    @Override
    public void createDestinatario(Destinatario desti) {
        repo.save(desti);
    }

    @Override
    public List<Envio> traerEnvios(Long idDest) {
       return repo_dest.getEnvios(idDest);
    }
    
 
    
}
