/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ingredientes.ingredientes.Controller;

import com.ingredientes.ingredientes.DTO.PlatoDTO;
import com.ingredientes.ingredientes.Model.Ingrediente;
import com.ingredientes.ingredientes.Service.IIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Virginia
 */
@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {
    @Autowired
    private IIngredienteService servis;
    
    @PostMapping("/saveIngrediente")
     public ResponseEntity<String> saveIngrediente(@RequestBody Ingrediente ingre){
         try {
            servis.saveIngrediente(ingre);
            return ResponseEntity.status(HttpStatus.OK).body("Ingrediente creado con éxito");
            
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el ingrediente: "+e.getMessage());
        }
     }
        
     @DeleteMapping("/deleteIngrediente/{id}")
    public ResponseEntity<String> deleteIngrediente(@PathVariable Long id){
        if(servis.findIngrediente(id)==null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ingrediente con id: "+id+" no encontrado.");
        }
          try {
            servis.deleteIngrediente(id);
            return ResponseEntity.status(HttpStatus.OK).body("Ingrediente eliminado con éxito");
            
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar el ingrediente: "+e.getMessage());
        }
    }
    
    @PutMapping("/updateIngrediente")
    public ResponseEntity<?> updateIngrediente(Ingrediente ingre){
                 try {
            servis.updateIngrediente(ingre);
            return ResponseEntity.status(HttpStatus.OK).body(ingre);
            
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al editar el ingrediente: "+e.getMessage());
        }
    }
    
    
    @GetMapping("/findIngrediente/{id}")
    public ResponseEntity<?> findIngrediente(@PathVariable Long id){
    try {
             Ingrediente ingre=servis.findIngrediente(id);
            if(ingre==null){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ingrediente con id: "+id+" no se encontró");
                                       }
            else{
                            return ResponseEntity.status(HttpStatus.OK).body(ingre);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al encontrar el ingrediente: "+e.getMessage());
        }
    }
    
    @GetMapping("/getAllIngredientes")
    public ResponseEntity<?> getAllIngredientes(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servis.getAllIngredientes());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al buscar los ingredientes: "+e.getMessage());
        }
    }
    
    @PutMapping("/agregarPlato")
    public ResponseEntity<?> añadirPlato(@RequestBody PlatoDTO dto){
        try {
            servis.guardarPlato(dto);
            return ResponseEntity.status(HttpStatus.OK).body("Ingredientes agregados con éxito");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar solicitud: "+e.getMessage());
                   }
       
    }
}
