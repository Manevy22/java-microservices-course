
package com.platos.platos.Controller;

import com.platos.platos.Model.Plato;
import com.platos.platos.Service.IPlatoService;
import java.util.List;
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


@RestController 
@RequestMapping("/plato")
public class PlatoController {
    
    @Autowired
    private IPlatoService servis;
    
    //1.Crear un plato nuevo
    @   PostMapping("/create")
    public ResponseEntity<String> createPlato(@RequestBody Plato plato){
        try {
            servis.savePlato(plato);
            return ResponseEntity.status(HttpStatus.OK).body("Plato correctamente creado");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el plato: "+e.getMessage());
        }
    }
    
    //2.Obtener todos los platos
    @GetMapping("/getAll")
    public ResponseEntity <List<Plato>> getAllPlatos(){
        try {
            
                    List<Plato> lista=servis.getPlatos();
                        return ResponseEntity.status(HttpStatus.OK).body(lista);
                        //si la lista está vacía de todas formas se considera una respuesta del tipo status=200
                        
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);}
    }
    
    //3. Eliminar un plato  
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePlato(@PathVariable Long id){
        try {
            if(servis.findPlato(id)!=null){
        servis.deletePlato(id);
        return ResponseEntity.ok("Plato eliminado");
}
        else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Plato con id "+id+" no encontrado");
                }
            }
    catch (Exception e) {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar el plato:"+e.getMessage());        
}}

    //4.Editar un Plato
    @PutMapping("/update/{id}")
public ResponseEntity<?> UpdatePlato(@PathVariable Long id, @RequestBody Plato plato) {
    try {
        Plato plat = servis.findPlato(id);  // Verifica si el plato existe

        if (plat != null) {
            servis.editPlato(id, plato);  // Actualiza el plato con los nuevos datos
            return ResponseEntity.ok(plato);  // Devuelve el objeto actualizado (sin necesidad de otra búsqueda)
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("No se encontró el plato con el id: " + id);
        }
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("Error al actualizar el plato: " + e.getMessage());
    }
}
    //put se utiliza para editar

    
    //5.Obtener un plato
    @GetMapping("/find/{id}")
    public ResponseEntity<?>  findPlato(@PathVariable Long id){
        try {
             Plato plat=servis.findPlato(id);
             if(plat!=null){
                 return ResponseEntity.ok(plat);
             }
             else {
                 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró al plato con el id: "+id);
             }
 

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno: "+e.getMessage());
        }
    }
    
}
