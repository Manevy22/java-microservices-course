/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CursoMSA.DESTINATARIO.Repository;

import com.CursoMSA.DESTINATARIO.Model.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Virginia
 */

public interface IRepositoryDestinatario extends JpaRepository<Destinatario, Long>{
    
}
