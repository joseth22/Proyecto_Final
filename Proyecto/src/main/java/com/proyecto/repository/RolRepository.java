package com.proyecto.repository;

import com.proyecto.entity.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {

}