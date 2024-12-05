package com.web_example.Telefonia.Services.ServicePessoal;

import com.web_example.Telefonia.Model.Pessoal.Cliente;
import com.web_example.Telefonia.Model.Pessoal.ClientePessoaFisica;
import com.web_example.Telefonia.Model.Pessoal.ClientePessoaJuridica;
import com.web_example.Telefonia.Repository.RepositoryPessoal.ClientePessoaFisicaRepository;
import com.web_example.Telefonia.Repository.RepositoryPessoal.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClientePessoaFisicaService {

    @Autowired
    private ClientePessoaFisicaRepository clientePessoaFisicaRepository;

    public ClientePessoaFisica saveClientePessoaFisica(ClientePessoaFisica clientePessoaFisica){
        return clientePessoaFisicaRepository.save(clientePessoaFisica);
    }

    public List<ClientePessoaFisica> getAllClientesPessoaFisica(){
        return clientePessoaFisicaRepository.findAll();
    }

    public ClientePessoaFisica getClientePessoaFisicaById(Long id){
        Optional<ClientePessoaFisica> clientePessoaFisica = clientePessoaFisicaRepository.findById(id);
        return clientePessoaFisica.orElse(null);
    }

    public ClientePessoaFisica updateClientePessoaFisica(Long id, ClientePessoaFisica updateClientePessoaFisica){
        Optional<ClientePessoaFisica> clientePessoaFisica = clientePessoaFisicaRepository.findById(id);
        if(clientePessoaFisica.isPresent()){
            ClientePessoaFisica existingClientePessoaFisica = clientePessoaFisica.get();
            existingClientePessoaFisica.setCpf(updateClientePessoaFisica.getCpf());
            return clientePessoaFisicaRepository.save(existingClientePessoaFisica);

        }else {
            return null;
        }
    }

    public void deleteClientePessoaFisica(Long id){
        clientePessoaFisicaRepository.deleteById(id);
    }
}
