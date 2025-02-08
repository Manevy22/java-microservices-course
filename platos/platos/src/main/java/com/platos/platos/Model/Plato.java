/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platos.platos.Model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
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
public class Plato {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long nroPlato;
    private String nombre;
    private Double precio;
    private String descrip;
       @ElementCollection(fetch = FetchType.EAGER)
    private List<String> lista_ingredientes;
    
}
