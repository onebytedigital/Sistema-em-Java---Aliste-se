package br.com.alistese.alistese.repository;

import br.com.alistese.alistese.model.Soldado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldadoRepository extends JpaRepository<Soldado, Integer> {

}
