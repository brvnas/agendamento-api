package com.agendamento.agendamento_api.controller;

import com.agendamento.agendamento_api.model.Servico;
import com.agendamento.agendamento_api.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoRepository servicoRepository;

    @GetMapping
    public List<Servico> listar() {
        return servicoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Servico> criar(@RequestBody Servico servico) {
        Servico novoServico = servicoRepository.save(servico);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoServico);
    }
}