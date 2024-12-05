package com.web_example.Telefonia.controller.Pessoal;

import com.web_example.Telefonia.Model.Pessoal.ClientePessoaJuridica;
import com.web_example.Telefonia.Services.ServicePessoal.ClientePessoaJuridicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente-pessoa-juridica")
public class ClientePessoaJuridicaController {

    @Autowired
    private ClientePessoaJuridicaService clientePessoaJuridicaService;

    @PostMapping
    public ClientePessoaJuridica createClientePessoaJuridica(@RequestBody ClientePessoaJuridica clientePessoaJuridica) {
        return clientePessoaJuridicaService.saveClientePessoaJuridica(clientePessoaJuridica);
    }

    @GetMapping
    public List<ClientePessoaJuridica> getAllClientesPessoaJuridica() {
        return clientePessoaJuridicaService.getAllClientePessoaJuridica();
    }

    @GetMapping("/{id}")
    public ClientePessoaJuridica getClientePessoaJuridicaById(@PathVariable Long id) {
        return clientePessoaJuridicaService.getClientePessoaJuridicaById(id);
    }

    @PutMapping("/{id}")
    public ClientePessoaJuridica updateClientePessoaJuridica(@PathVariable Long id, @RequestBody ClientePessoaJuridica clientePessoaJuridica) {
        return clientePessoaJuridicaService.updateClientePessoaJuridica(id, clientePessoaJuridica);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClientePessoaJuridica(@PathVariable Long id) {
        clientePessoaJuridicaService.deleteClientePessoaJuridica(id);
        return ResponseEntity.ok().build();
    }
}

