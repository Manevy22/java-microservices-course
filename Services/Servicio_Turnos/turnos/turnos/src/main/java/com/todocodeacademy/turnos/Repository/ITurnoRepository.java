/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocodeacademy.turnos.Repository;

import com.todocodeacademy.turnos.Model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Virginia
 */
public interface ITurnoRepository extends JpaRepository<Turno, Long> {
    
}
