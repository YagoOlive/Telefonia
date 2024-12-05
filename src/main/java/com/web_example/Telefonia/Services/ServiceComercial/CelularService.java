package com.web_example.Telefonia.Services.ServiceComercial;

import com.web_example.Telefonia.Model.Comercial.Celular;
import com.web_example.Telefonia.Repository.RepositoryComercial.CelularRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CelularService {

    @Autowired
    private CelularRepository celularRepository;

    public Celular saveCelular(Celular celular){
        return celularRepository.save(celular);
    }

    public List<Celular> getAllCelular(){
        return  celularRepository.findAll();
    }

    public Celular getCelularById(Long id){
        Optional<Celular> celular = celularRepository.findById(id);
        return celular.orElse(null);
    }

    public Celular updateCelular(Long id, Celular updateCelular){
        Optional<Celular> celular = celularRepository.findById(id);
        if(celular.isPresent()){
            Celular existingCelular = celular.get();
            existingCelular.setCliente(updateCelular.getCliente());
            existingCelular.setLigacoes(updateCelular.getLigacoes());
            existingCelular.setNumero(updateCelular.getNumero());
            existingCelular.setPlano(updateCelular.getPlano());
            return celularRepository.save(existingCelular);
        }else{
            return null;
        }
    }

    public void deleteCelular(Long id){
        celularRepository.deleteById(id);
    }
}
