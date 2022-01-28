package br.com.alistese.alistese.service;

import br.com.alistese.alistese.model.Funcao;
import br.com.alistese.alistese.repository.FuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncaoService {
    @Autowired
    FuncaoRepository funcaoRepository;

    public List<Funcao> findAll() {
        return funcaoRepository.findAll();
    }
}
