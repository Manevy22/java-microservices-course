/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingredientes.ingredientes.DTO;

import java.util.List;
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
public class PlatoDTO {
        private String nombre_plato;
    private List<String> lista_ingredientes;
}
