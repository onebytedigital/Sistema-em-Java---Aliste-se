package br.com.alistese.alistese.repository;

import br.com.alistese.alistese.model.Pelotao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PelotaoRepository extends JpaRepository<Pelotao, Integer> {
}
