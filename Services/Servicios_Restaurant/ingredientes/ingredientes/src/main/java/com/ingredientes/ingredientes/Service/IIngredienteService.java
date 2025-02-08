/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ingredientes.ingredientes.Service;

import com.ingredientes.ingredientes.DTO.PlatoDTO;
import com.ingredientes.ingredientes.Model.Ingrediente;
import java.util.List;

/**
 *
 * @author Virginia
 */

public interface IIngredienteService{
    public void saveIngrediente(Ingrediente ingre);
    public void deleteIngrediente(Long id);
    public void updateIngrediente(Ingrediente ingre);
    public Ingrediente findIngrediente(Long id);
    public List<Ingrediente> getAllIngredientes();

    public void guardarPlato(PlatoDTO dto);
}
