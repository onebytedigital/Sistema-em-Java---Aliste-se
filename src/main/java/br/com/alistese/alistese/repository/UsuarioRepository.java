package br.com.alistese.alistese.repository;

import br.com.alistese.alistese.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByNomeUsuario(String nomeUsuario);
}
