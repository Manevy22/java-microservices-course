/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocodeacademy.turnos.Controller;

import com.todocodeacademy.turnos.DTO.TurnoDTO;
import com.todocodeacademy.turnos.Model.Turno;
import com.todocodeacademy.turnos.Service.ITurnoService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Virginia
 */
@RestController
@RequestMapping("/turnos")
public class TurnoController {
    
    @Autowired
    private ITurnoService turnoServ;
    

    
    //1-crear un nuevo turno
    //AGREGAR FUNCIONALIDAD DE QUE PASA SI NO EXISTE EL PACIENTE.
    @PostMapping("/crear")
    public String crearTurno(@RequestBody TurnoDTO turnoDto){
    turnoServ.saveTurno(turnoDto.getFecha(), turnoDto.getTratamiento(), turnoDto.getDniPaciente());
        return "Turno creado correctamente";
    } 
    
    //2-Obtener todos los turnos
    @GetMapping("/traer")
    public List<Turno> traerTurnos(){
        return turnoServ.getTurnos();
    }
    
    //3-Eliminar un turno
    @DeleteMapping("/borrar/{id}")
    public String borrarTurno(@PathVariable Long id){
        turnoServ.deleteTurno(id);
        return "Turno borrado correctamente";
    }
    
    //4-Editar turno
    @PostMapping("/editar/{id_original}")
    public Turno editarTurno(@PathVariable Long id_original, @RequestBody Turno turno){
        turnoServ.editTurno(id_original, turno);
        Turno turnoNew= turnoServ.findTurno(id_original);
return turnoNew;
    }
    
    //5-Obtener un turno
    @GetMapping("/traer/{id}")
    public Turno buscarTurno(@PathVariable Long id){
        return turnoServ.findTurno(id);
    }
    
    
}
