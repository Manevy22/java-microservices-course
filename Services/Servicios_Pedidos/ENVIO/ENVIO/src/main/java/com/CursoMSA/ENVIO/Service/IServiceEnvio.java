/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CursoMSA.ENVIO.Service;

import com.CursoMSA.ENVIO.Model.Envio;
import java.util.List;

/**
 *
 * @author Virginia
 */
public interface IServiceEnvio {
    public void createEnvio(Envio envio);

    public List<Envio> traerPedidos(Long idDest);
   
    
}
