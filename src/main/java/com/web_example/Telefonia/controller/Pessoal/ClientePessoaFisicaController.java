package com.web_example.Telefonia.controller.Pessoal;

import com.web_example.Telefonia.Model.Pessoal.ClientePessoaFisica;
import com.web_example.Telefonia.Services.ServicePessoal.ClientePessoaFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente-pessoa-fisica")
public class ClientePessoaFisicaController {

    @Autowired
    private ClientePessoaFisicaService clientePessoaFisicaService;

    @PostMapping
    public ClientePessoaFisica createClientePessoaFisica(@RequestBody ClientePessoaFisica clientePessoaFisica) {
        return clientePessoaFisicaService.saveClientePessoaFisica(clientePessoaFisica);
    }

    @GetMapping
    public List<ClientePessoaFisica> getAllClientesPessoaFisica() {
        return clientePessoaFisicaService.getAllClientesPessoaFisica();
    }

    @GetMapping("/{id}")
    public ClientePessoaFisica getClientePessoaFisicaById(@PathVariable Long id) {
        return clientePessoaFisicaService.getClientePessoaFisicaById(id);
    }

    @PutMapping("/{id}")
    public ClientePessoaFisica updateClientePessoaFisica(@PathVariable Long id, @RequestBody ClientePessoaFisica clientePessoaFisica) {
        return clientePessoaFisicaService.updateClientePessoaFisica(id, clientePessoaFisica);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClientePessoaFisica(@PathVariable Long id) {
        clientePessoaFisicaService.deleteClientePessoaFisica(id);
        return ResponseEntity.ok().build();
    }
}

