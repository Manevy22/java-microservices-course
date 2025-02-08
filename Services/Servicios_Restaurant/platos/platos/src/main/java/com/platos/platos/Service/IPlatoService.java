
package com.platos.platos.Service;

import com.platos.platos.Model.Plato;
import java.util.List;


public interface IPlatoService {
    public void savePlato(Plato plato);
    public List<Plato> getPlatos();
    public Plato findPlato(Long id);
    public void deletePlato(Long id);
    public void editPlato(Long id_Orig, Plato plato);
}
//los post no devuelven textos con info como "plato correctamente creado" 
//porque eso se hace en el controller
