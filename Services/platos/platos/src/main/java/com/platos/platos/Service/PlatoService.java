
package com.platos.platos.Service;

import com.platos.platos.DTO.PlatoDTO;
import com.platos.platos.Model.Plato;
import com.platos.platos.Repository.IPlatoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service  
public class PlatoService implements IPlatoService {
    
    @Autowired
    private IPlatoRepository repo;
    
    @Autowired
    private RestTemplate apiConsumir;

   @Override
public void savePlato(Plato plato) {

    // Debe llamar al servicio Ingredientes y pasarle la lista
    String url = "http://localhost:9001/ingredientes/agregarPlato";

    // Crear headers
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    // Crear request entity
    PlatoDTO dto= new PlatoDTO(plato.getNombre(), plato.getLista_ingredientes());
    HttpEntity<PlatoDTO> requestEntity = new HttpEntity<>(dto, headers);
//se coloca en el requestBody un header en el cual se especifica el formato del objeto.

    // Enviar la solicitud POST
    apiConsumir.exchange(url, HttpMethod.PUT, requestEntity, Void.class);
        repo.save(plato);

}


    @Override
    public List<Plato> getPlatos() {
        return repo.findAll();
    }

    @Override
    public Plato findPlato(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deletePlato(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void editPlato(Long id_Orig, Plato plato) {
        Plato platoNue= this.findPlato(id_Orig);
        platoNue.setNombre(plato.getNombre());
        platoNue.setPrecio(plato.getPrecio());
        platoNue.setDescrip(plato.getDescrip());
        platoNue.setLista_ingredientes(plato.getLista_ingredientes());
        this.savePlato(platoNue);
    }
}
