package com.web_example.Telefonia.Services.ServiceComercial;

import com.web_example.Telefonia.Model.Comercial.Plano;
import com.web_example.Telefonia.Repository.RepositoryComercial.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PlanoService {

    @Autowired
    private PlanoRepository planoRepository;

    public Plano savePlano (Plano plano){
        return planoRepository.save(plano);
    }

    public List<Plano> getAllPlanos(){
        return planoRepository.findAll();
    }

    public Plano getPlanoById(Long id){
        Optional<Plano> plano = planoRepository.findById(id);
        return plano.orElse(null);
    }

    public Plano updatePlano(Long id, Plano updatePlano){
        Optional<Plano> plano = planoRepository.findById(id);
        if(plano.isPresent()){
            Plano existingPlano = plano.get();
            existingPlano.setNome(updatePlano.getNome());
            existingPlano.setValorPorMinuto(updatePlano.getValorPorMinuto());
            return planoRepository.save(existingPlano);
        }else{
            return null;
        }
    }

    public void deletePlano(Long id){
        planoRepository.deleteById(id);
    }

}
