package com.agendamento.agendamento_api.repository;

import com.agendamento.agendamento_api.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    // Método customizado para checar conflitos de horário
    boolean existsByProfissionalIdAndDataHora(Long profissionalId, LocalDateTime dataHora);
}