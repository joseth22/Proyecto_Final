package com.proyecto.service;

import com.proyecto.entity.Compra;
import com.proyecto.repository.CompraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService implements ICompraService {

    @Autowired
    private CompraRepository compraRepository;

    @Override
    public List<Compra> getAllCompra() {
        return (List<Compra>) compraRepository.findAll();
    }

    @Override
    public Compra getCompraById(long id) {
        return compraRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCompra(Compra compra) {
        compraRepository.save(compra);
    }

    @Override
    public void delete(long id) {
        compraRepository.deleteById(id);
    }

}
