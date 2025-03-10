
package com.todocodeacademy.pacientes.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Getter @Setter
@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idPaciente;
private String dni;
private String nombre;
private String apellido;
private Date fechaNac;
private String telefono;
 
public Paciente(){}

public Paciente(Long id, String dni, String nombre, String apellido, Date fechaNac, String telefono){
    this.idPaciente=idPaciente;
    this.dni=dni;
    this.nombre=nombre;
    this.apellido=apellido;
    this.fechaNac=fechaNac;
    this.telefono=telefono;
}
        



}
