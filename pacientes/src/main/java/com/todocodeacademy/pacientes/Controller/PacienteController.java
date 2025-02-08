/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.todocodeacademy.pacientes.Controller;

import com.todocodeacademy.pacientes.Model.Paciente;
import com.todocodeacademy.pacientes.Service.IPacienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Virginia
 */
@RestController
@RequestMapping("/pacientes")
public class PacienteController {
@Autowired
private IPacienteService pacienteServ;

@PostMapping ("/crear")
public String crearCurso(@RequestBody Paciente pac){
    pacienteServ.savePaciente(pac);
    return "Paciente creado correctamente";
}

@GetMapping ("/traer")
public List<Paciente> traerPacientes(){
    return pacienteServ.getPacientes();
}

@DeleteMapping ("/borrar/{id}")
public String deletePaciente(@PathVariable Long id){
    pacienteServ.deletePaciente(id);
    return "El paciente fue eliminado correctamente ";
}

@PutMapping ("/editar/{id_original}")
public Paciente editPaciente(@PathVariable Long id_original, @RequestBody Paciente pacienteEditar){
    pacienteServ.editPaciente(pacienteEditar);
    Paciente pacienteEditado=pacienteServ.findPaciente(id_original);
    return pacienteEditado;
}

@GetMapping ("/traer/{id}")
public Paciente traerPaciente(@PathVariable Long id){
    return pacienteServ.findPaciente(id);
}
@GetMapping ("/traerDni/{dni}")
public Paciente traerPacienteXdni(@PathVariable String dni){
    return pacienteServ.findPacienteXdni(dni);
}

    
}
