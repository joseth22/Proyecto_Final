package com.proyecto.repository;

import com.proyecto.entity.Compra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends CrudRepository<Compra, Long> {


}
