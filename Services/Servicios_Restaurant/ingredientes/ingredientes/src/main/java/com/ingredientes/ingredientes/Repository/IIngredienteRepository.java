package com.ingredientes.ingredientes.Repository;

import com.ingredientes.ingredientes.Model.Ingrediente;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IIngredienteRepository extends JpaRepository<Ingrediente,Long>{

  @Query("SELECT I FROM Ingrediente I WHERE I.nombre_ingrediente = :ingrediente")
Optional<Ingrediente> buscarIngrediente(@Param("ingrediente") String ingrediente);

}
