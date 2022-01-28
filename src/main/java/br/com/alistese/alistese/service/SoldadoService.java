package br.com.alistese.alistese.service;

import br.com.alistese.alistese.model.Soldado;
import br.com.alistese.alistese.repository.SoldadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {
    @Autowired
    SoldadoRepository soldadoRepository;

    public void save(Soldado soldado) {
        soldadoRepository.save(soldado);
    }

    public Iterable<Soldado> findAll() {
        return soldadoRepository.findAll();
    }

    public long count() {
        return soldadoRepository.count();
    }
}
