/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.todocodeacademy.turnos.Service;

import com.todocodeacademy.turnos.Model.Turno;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Virginia
 */
public interface ITurnoService {
    public List<Turno> getTurnos();
    public void saveTurno(LocalDate fecha, String tratamiento, String dniPaciente);
    public void deleteTurno(Long id);
    public Turno findTurno(Long id);
    public void editTurno(Long id, Turno turno);
}
