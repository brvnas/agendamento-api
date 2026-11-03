package com.agendamento.agendamento_api.controller;

import com.agendamento.agendamento_api.model.Cliente;
import com.agendamento.agendamento_api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    // Rota GET: Listar todos os clientes
    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    // Rota POST: Criar um novo cliente
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
        Cliente novoCliente = clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
    }
}