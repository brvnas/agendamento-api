package com.agendamento.agendamento_api.repository;

import com.agendamento.agendamento_api.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {
}