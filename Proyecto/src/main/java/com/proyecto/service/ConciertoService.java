package com.proyecto.service;

import com.proyecto.entity.Concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.repository.ConciertoRepository;

@Service
public class ConciertoService implements IConciertoService {

    @Autowired
    private ConciertoRepository conciertoRepository;

    @Override
    public List<Concierto> getAllConcierto() {
        return (List<Concierto>) conciertoRepository.findAll();
    }

    @Override
    public Concierto getConciertoById(long id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(Concierto concierto) {
        conciertoRepository.save(concierto);
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id);
    }

}
