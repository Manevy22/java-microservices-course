/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.todocodeacademy.pacientes.Repository;
import com.todocodeacademy.pacientes.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.todocodeacademy.pacientes.Model.Paciente;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Virginia
 */
@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Long>{
@Query ("SELECT p FROM Paciente p WHERE p.dni = :dni ")
Paciente findByDni(String dni);
}
