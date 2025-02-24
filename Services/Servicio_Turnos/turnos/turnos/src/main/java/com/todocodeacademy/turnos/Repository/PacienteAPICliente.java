/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.todocodeacademy.turnos.Repository;

import com.todocodeacademy.turnos.Model.Paciente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="pacientes", url="http://localhost:9001/pacientes")
public interface PacienteAPICliente {
    
    @GetMapping("/traerDni/{dni}")
    public Paciente traerPacienteXdni(@PathVariable ("dni") String dni);
    
}
