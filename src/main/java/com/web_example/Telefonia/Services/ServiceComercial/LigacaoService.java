package com.web_example.Telefonia.Services.ServiceComercial;

import com.web_example.Telefonia.Model.Comercial.Ligacao;
import com.web_example.Telefonia.Repository.RepositoryComercial.LigacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor;

import java.util.List;
import java.util.Optional;

public class LigacaoService {

    @Autowired
    private LigacaoRepository ligacaoRepository;

    public Ligacao saveLigacao(Ligacao ligacao){
        return ligacaoRepository.save(ligacao);
    }

    public List<Ligacao> getAllLigacoes(){
        return ligacaoRepository.findAll();
    }

    public Ligacao getLigacaoById(Long id) {
        Optional<Ligacao> ligacao = ligacaoRepository.findById(id);
        return ligacao.orElse(null);
    }

    public Ligacao updateLigacao(Long id, Ligacao updateLigacao){
        Optional<Ligacao> ligacao = ligacaoRepository.findById(id);
        if(ligacao.isPresent()){
            Ligacao existingLigacao = ligacao.get();
            existingLigacao.setData(updateLigacao.getData());
            existingLigacao.setDuracao((updateLigacao.getDuracao()));
            return ligacaoRepository.save(existingLigacao);

        }else{
            return  null;
        }
    }

    public void deleteLigacao(Long id){
        ligacaoRepository.deleteById(id);
    }

}
