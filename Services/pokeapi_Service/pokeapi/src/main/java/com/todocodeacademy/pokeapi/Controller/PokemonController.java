/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocodeacademy.pokeapi.Controller;

import com.todocodeacademy.pokeapi.Repository.PokeAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.todocodeacademy.pokeapi.DTO.PokemonDTO;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Virginia
 */
@RestController
public class PokemonController {
    @Autowired
    private PokeAPIClient pokeAPIClient;
    
    @GetMapping("/pokemon/{pokemonId}")
    public PokemonDTO getPokemonInfo(@PathVariable ("pokemonId") int pokemonId){
        return pokeAPIClient.getPokemonInfo(pokemonId);
    }
}
