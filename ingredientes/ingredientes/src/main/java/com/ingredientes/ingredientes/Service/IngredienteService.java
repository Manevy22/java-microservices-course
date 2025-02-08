/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingredientes.ingredientes.Service;

import com.ingredientes.ingredientes.DTO.PlatoDTO;
import com.ingredientes.ingredientes.Model.Ingrediente;
import com.ingredientes.ingredientes.Repository.IIngredienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Virginia
 */
@Service
public class IngredienteService implements IIngredienteService{
    @Autowired
 private IIngredienteRepository repo;   
 

    @Override
    public void saveIngrediente(Ingrediente ingre) {
        repo.save(ingre);
    }

    @Override
    public void deleteIngrediente(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void updateIngrediente(Ingrediente ingre) {
        //1.Verificar existencia
        Ingrediente ing=this.findIngrediente(ingre.getId_ingrediente());
        if(ing!=null){
            ing.setNombre_ingrediente(ingre.getNombre_ingrediente());
            ing.setLista_platos(ingre.getLista_platos());
            repo.save(ing);
        }
        
    }

    @Override
    public Ingrediente findIngrediente(Long id) {
      return  repo.findById(id).orElse(null);
        
    }

    @Override
    public List<Ingrediente> getAllIngredientes() {
       return repo.findAll();
    }

@Override
public void guardarPlato(PlatoDTO dto) {
    for (String ingrediente : dto.getLista_ingredientes()) {
        Optional<Ingrediente> optionalIng = repo.buscarIngrediente(ingrediente);
        if (optionalIng.isPresent()) {
            Ingrediente ing = optionalIng.get();
            ing.getLista_platos().add(dto.getNombre_plato());
            repo.save(ing); 
        } 
    }
}

    
}
