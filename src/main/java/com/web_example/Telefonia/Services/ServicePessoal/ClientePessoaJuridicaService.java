package com.web_example.Telefonia.Services.ServicePessoal;


import com.web_example.Telefonia.Model.Pessoal.ClientePessoaJuridica;
import com.web_example.Telefonia.Repository.RepositoryPessoal.ClientePessosaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClientePessoaJuridicaService {

        @Autowired
        private ClientePessosaJuridicaRepository clientePessosaJuridicaRepository;

        public ClientePessoaJuridica saveClientePessoaJuridica(ClientePessoaJuridica clientePessoaJuridica){
            return clientePessosaJuridicaRepository.save(clientePessoaJuridica);
        }

        public List<ClientePessoaJuridica> getAllClientePessoaJuridica(){
            return clientePessosaJuridicaRepository.findAll();
        }

        public ClientePessoaJuridica getClientePessoaJuridicaById(Long id){
            Optional<ClientePessoaJuridica> clientePessoaJuridica = clientePessosaJuridicaRepository.findById(id);
            return clientePessoaJuridica.orElse(null);
        }

        public ClientePessoaJuridica updateClientePessoaJuridica(Long id, ClientePessoaJuridica updateClientePessoaJuridica){
            Optional<ClientePessoaJuridica> clientePessoaJuridica = clientePessosaJuridicaRepository.findById(id);
            if(clientePessoaJuridica.isPresent()){
                ClientePessoaJuridica existingClientePessoaJuridica = clientePessoaJuridica.get();
                existingClientePessoaJuridica.setCnpj(updateClientePessoaJuridica.getCnpj());
                return clientePessosaJuridicaRepository.save(existingClientePessoaJuridica);

            }else {
                return null;
            }
        }

        public void deleteClientePessoaJuridica(Long id){
            clientePessosaJuridicaRepository.deleteById(id);
        }




}
