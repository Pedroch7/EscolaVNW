package br.com.vainaweb.escola1.rpo;

import br.com.vainaweb.escola1.entity.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Colaboradorrpo extends JpaRepository <Colaborador, Long> {
}
