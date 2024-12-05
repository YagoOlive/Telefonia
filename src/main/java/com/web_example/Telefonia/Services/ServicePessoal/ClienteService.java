package com.web_example.Telefonia.Services.ServicePessoal;

import com.web_example.Telefonia.Model.Pessoal.Cliente;
import com.web_example.Telefonia.Repository.RepositoryPessoal.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }

    public Cliente getClienteById(Long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    public Cliente updateCliente(Long id, Cliente updateCliente){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente.isPresent()){
            Cliente existingCliente = cliente.get();
            existingCliente.setNome(updateCliente.getNome());
            existingCliente.setEndereco(updateCliente.getEndereco());
            return clienteRepository.save(existingCliente);

        }else {
            return null;
        }
    }

    public void deleteCliente(Long id){
        clienteRepository.deleteById(id);
    }
}
