package com.proyecto.repository;

import com.proyecto.entity.Permiso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface PermisoRepository  extends CrudRepository<Permiso, Long>{
    
}
