/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.todocodeacademy.pacientes.Service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.todocodeacademy.pacientes.Model.Paciente;
import com.todocodeacademy.pacientes.Repository.PacienteRepository; 


/**
 *
 * @author Virginia
 */
@Service
public class PacienteService implements IPacienteService {

    @Autowired
    private PacienteRepository pacienteRepo;
    
    @Override
    public List<Paciente> getPacientes(){
        return pacienteRepo.findAll();
    }
    
    @Override
    public void savePaciente(Paciente pac){
        pacienteRepo.save(pac);
    }
    
    @Override
    public void deletePaciente(Long id){
        pacienteRepo.deleteById(id);
    }
    @Override
    public Paciente findPaciente(Long id){
        return pacienteRepo.findById(id).orElse(null);
    }
    @Override 
    public void editPaciente(Paciente pac){
        this.savePaciente(pac);
    }

    @Override
    public Paciente findPacienteXdni(String dni) {
        return pacienteRepo.findByDni(dni);
    }
    
 
    
         
}
