package com.agendamento.agendamento_api.repository;

import com.agendamento.agendamento_api.model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
}
