/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.CursoMSA.ENVIO.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 *
 * @author Virginia
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Envio {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Temporal(TemporalType.DATE)
private LocalDate fecha_creacion;
private String estado;
private String des;
private Long id_destinatario;
}
