package com.proyecto.service;

import com.proyecto.entity.Teatro;
import java.util.List;

public interface ITeatroService {

    public List<Teatro> getAllTeatro();

    public Teatro getTeatroById(long id);

    public void saveTeatro(Teatro teatro);

    public void delete(long id);

}