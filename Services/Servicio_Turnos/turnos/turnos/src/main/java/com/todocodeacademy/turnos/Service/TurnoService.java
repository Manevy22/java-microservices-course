/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocodeacademy.turnos.Service;

import com.todocodeacademy.turnos.Model.Paciente;
import com.todocodeacademy.turnos.Model.Turno;
import com.todocodeacademy.turnos.Repository.ITurnoRepository;
import com.todocodeacademy.turnos.Repository.PacienteAPICliente;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Virginia
 */
@Service    
public class TurnoService implements ITurnoService{
    
    @Autowired
    private ITurnoRepository turnoRepo;
        @Autowired 
    private RestTemplate apiConsumir;
        @Autowired
        private PacienteAPICliente PAC;

    @Override
    public List<Turno> getTurnos() {
        return turnoRepo.findAll();
    }

    @Override
    public void saveTurno(LocalDate fecha, String tratamiento, String dniPaciente) {
        //buscar el paciente en la api paciente
        Paciente pac=PAC.traerPacienteXdni(dniPaciente);
        String nombreCompletoPaciente=pac.getNombre()+" "+pac.getApellido();
        Turno turno=new Turno();
        turno.setFecha(fecha);
        turno.setTratamiento(tratamiento);
        turno.setNombreCompletoPaciente(nombreCompletoPaciente);
        turnoRepo.save(turno);
    }

    @Override
    public void deleteTurno(Long id) {
        turnoRepo.deleteById(id);
    }

    @Override
    public Turno findTurno(Long id) {
        return turnoRepo.findById(id).orElse(null);
    }

    @Override
    public void editTurno(Long id, Turno turno) {
        Turno turn=this.findTurno(id);
        
        turno.setFecha(turno.getFecha());
        turno.setTratamiento(turno.getTratamiento());
        turno.setNombreCompletoPaciente(turno.getNombreCompletoPaciente());
        
        turnoRepo.save(turn);
    }
    
}
