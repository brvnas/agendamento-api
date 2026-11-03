package com.agendamento.agendamento_api.service;

import com.agendamento.agendamento_api.model.Agendamento;
import com.agendamento.agendamento_api.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public List<Agendamento> listar() {
        return agendamentoRepository.findAll();
    }

    public Agendamento salvar(Agendamento agendamento) {
        // Regra de Negócio: Verifica se o horário já está ocupado para aquele profissional
        boolean horarioOcupado = agendamentoRepository.existsByProfissionalIdAndDataHora(
                agendamento.getProfissional().getId(),
                agendamento.getDataHora()
        );

        if (horarioOcupado) {
            throw new RuntimeException("Horário já reservado para este profissional.");
        }

        return agendamentoRepository.save(agendamento);
    }
}