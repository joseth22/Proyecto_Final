package com.proyecto.service;

import com.proyecto.entity.Usuario;
import java.util.List;

public interface IUsuarioService {

    public List<Usuario> getAllUsuario();

    public Usuario getUsuarioById(long id);

    public void saveUsuario(Usuario usuario);

    public void delete(long id);

    public Usuario findByNombreUsuario(String nombreUsuario);
                 //Devolver una persona por el nombre 

}
