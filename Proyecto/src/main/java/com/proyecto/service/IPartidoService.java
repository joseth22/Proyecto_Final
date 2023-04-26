package com.proyecto.service;

import com.proyecto.entity.Partido;
import java.util.List;

public interface IPartidoService {

    public List<Partido> getAllPartido();

    public Partido getPartidoById(long id);

    public void savePartido(Partido partido);

    public void delete(long id);

}