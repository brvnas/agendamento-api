package com.agendamento.agendamento_api.controller;

import com.agendamento.agendamento_api.model.Profissional;
import com.agendamento.agendamento_api.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalController {

    @Autowired
    private ProfissionalRepository profissionalRepository;

    @GetMapping
    public List<Profissional> listar() {
        return profissionalRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Profissional> criar(@RequestBody Profissional profissional) {
        Profissional novoProfissional = profissionalRepository.save(profissional);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProfissional);
    }
}