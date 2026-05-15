package com.fatec.exer1_api.controller;

import com.fatec.exer1_api.model.Cliente;
import com.fatec.exer1_api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar(){
        return ResponseEntity.ok(service.listar());
    }
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente c){
        Cliente criado = service.criar(c);
        URI uri = URI.create("/clientes/" + criado.getId());
        return ResponseEntity.created(uri).body(criado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id){
        return service.remover(id) ?
                ResponseEntity.noContent().build() :
                ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(
            @PathVariable Long id,
            @RequestBody Cliente cliente) {

        Cliente existente = service.buscarPorId(id);
        if (existente == null)
            return ResponseEntity.notFound().build();

        cliente.setId(id);
        service.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }
}
