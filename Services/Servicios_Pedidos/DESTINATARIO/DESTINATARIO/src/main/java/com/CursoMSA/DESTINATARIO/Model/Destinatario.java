/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.CursoMSA.DESTINATARIO.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Virginia
 */
@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Destinatario {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idDest;
private String dni;
private String nombre_apellido;
private String direccion;
private String num_tel;
}
