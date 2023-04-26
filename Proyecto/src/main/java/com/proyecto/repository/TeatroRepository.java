package com.proyecto.repository;

import com.proyecto.entity.Teatro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeatroRepository extends CrudRepository<Teatro, Long> {

}
