package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Funcionario;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Funcionario entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
