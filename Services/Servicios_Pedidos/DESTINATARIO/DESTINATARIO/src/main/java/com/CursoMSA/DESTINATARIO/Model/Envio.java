/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CursoMSA.DESTINATARIO.Model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Virginia
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Envio {

private Long id;
private LocalDate fecha_creacion;
private String estado;
private String des;
private Long id_destinatario;
    
}
