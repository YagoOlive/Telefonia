package com.web_example.Telefonia.Services.ServiceComercial;

import com.web_example.Telefonia.Model.Comercial.CelularPosPago;
import com.web_example.Telefonia.Repository.RepositoryComercial.CelularPosPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CelularPosPagoService {

    @Autowired
    private CelularPosPagoRepository celularPosPagoRepository;

    public CelularPosPago saveCelularPosPago(CelularPosPago celularPosPago){
        return celularPosPagoRepository.save(celularPosPago);
    }

    public List<CelularPosPago> getAllCelularPosPago(){
        return  celularPosPagoRepository.findAll();
    }

    public CelularPosPago getCelularPosPagoById(Long id){
        Optional<CelularPosPago> celularPosPago = celularPosPagoRepository.findById(id);
        return celularPosPago.orElse(null);
    }

    public CelularPosPago updateCelularPosPago(Long id, CelularPosPago updateCelularPosPago){
        Optional<CelularPosPago> celularPosPago = celularPosPagoRepository.findById(id);
        if(celularPosPago.isPresent()){
            CelularPosPago existingCelularPosPago = celularPosPago.get();
            existingCelularPosPago.setPlano(updateCelularPosPago.getPlano());
            existingCelularPosPago.setCliente(updateCelularPosPago.getCliente());
            existingCelularPosPago.setLigacoes(updateCelularPosPago.getLigacoes());
            existingCelularPosPago.setNumero(updateCelularPosPago.getNumero());
            existingCelularPosPago.setNumero(updateCelularPosPago.getNumero());
            return celularPosPagoRepository.save(existingCelularPosPago);
        }else{
            return null;
        }
    }

    public void deleteCelularPosPago(Long id){
        celularPosPagoRepository.deleteById(id);
    }


}

