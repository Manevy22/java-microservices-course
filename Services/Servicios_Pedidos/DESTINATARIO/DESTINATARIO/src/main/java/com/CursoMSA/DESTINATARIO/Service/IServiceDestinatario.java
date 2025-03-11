/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CursoMSA.DESTINATARIO.Service;

import com.CursoMSA.DESTINATARIO.Model.Destinatario;
import com.CursoMSA.DESTINATARIO.Model.Envio;
import java.util.List;



/**
 *
 * @author Virginia
 */
public interface IServiceDestinatario {

    public void createDestinatario(Destinatario desti);
    public List<Envio> traerEnvios(Long idDest);
    
    
}
