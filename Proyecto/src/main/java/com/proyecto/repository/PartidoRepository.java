package com.proyecto.repository;

import com.proyecto.entity.Partido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends CrudRepository<Partido, Long> {

}
