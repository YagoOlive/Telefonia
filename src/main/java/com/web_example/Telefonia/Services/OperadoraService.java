package com.web_example.Telefonia.Services;

import com.web_example.Telefonia.Model.Operadora;
import com.web_example.Telefonia.Model.Pessoal.Cliente;
import com.web_example.Telefonia.Repository.OperadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OperadoraService {

    @Autowired
    private OperadoraRepository operadoraRepository;

    public Operadora saveOperadora(Operadora operadora){
        return operadoraRepository.save(operadora);
    }

    public List<Operadora> getAllOperadoras(){
        return operadoraRepository.findAll();
    }

    public Operadora getOperadoraById(Long id){
        Optional<Operadora> operadora = operadoraRepository.findById(id);
        return operadora.orElse(null);
    }

    public Operadora updateOperadora(Long id, Operadora updateOperadora){
        Optional<Operadora> operadora = operadoraRepository.findById(id);
        if(operadora.isPresent()){
            Operadora existingOperadora = operadora.get();
            existingOperadora.setNome(updateOperadora.getNome());
            existingOperadora.setClientes(updateOperadora.getClientes());
            existingOperadora.setCelulares(updateOperadora.getCelulares());
            existingOperadora.setPlanos(updateOperadora.getPlanos());
            return operadoraRepository.save(existingOperadora);
        } else{
            return null;
        }
    }

    public void deleteOperadora(Long id){
        operadoraRepository.deleteById(id);
    }
}
