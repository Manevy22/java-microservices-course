/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CursoMSA.ENVIO.Repository;

import com.CursoMSA.ENVIO.Model.Envio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Virginia
 */
public interface IRepositoryEnvio extends JpaRepository<Envio,Long>{

    @Query("SELECT e FROM Envio e WHERE e.id_destinatario=:idDest")
    public List<Envio> traerPedidos(Long idDest);
    
}
