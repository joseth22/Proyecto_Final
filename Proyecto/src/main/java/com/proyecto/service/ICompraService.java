package com.proyecto.service;

import com.proyecto.entity.Compra;
import java.util.List;

public interface ICompraService {

    public List<Compra> getAllCompra();

    public Compra getCompraById(long id);

    public void saveCompra(Compra compra);

    public void delete(long id);
}
