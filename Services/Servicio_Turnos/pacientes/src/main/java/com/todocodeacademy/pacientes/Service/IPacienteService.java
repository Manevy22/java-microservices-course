/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.todocodeacademy.pacientes.Service;
import com.todocodeacademy.pacientes.Model.Paciente;
import java.util.List;
import com.todocodeacademy.pacientes.Model.Paciente;

/**
 *
 * @author Virginia
 */

public interface IPacienteService {
public List<Paciente> getPacientes();
public void savePaciente(Paciente paciente);
public void deletePaciente(Long id);
public Paciente findPaciente(Long id);
public void editPaciente(Paciente paciente);
    public Paciente findPacienteXdni(String dni);
    
}
