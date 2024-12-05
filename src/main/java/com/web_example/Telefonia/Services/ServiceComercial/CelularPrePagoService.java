package com.web_example.Telefonia.Services.ServiceComercial;

import com.web_example.Telefonia.Model.Comercial.CelularPrePago;
import com.web_example.Telefonia.Repository.RepositoryComercial.CelularPrePagoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CelularPrePagoService {

    @Autowired
    private CelularPrePagoRepository celularPrePagoRepository;

    public CelularPrePago saveCelularPrePago(CelularPrePago celularPrePago){
        return celularPrePagoRepository.save(celularPrePago);
    }

    public List<CelularPrePago> getAllCelularPrePago(){
        return celularPrePagoRepository.findAll();
    }

    public CelularPrePago getCelularPrePagoById(Long id){
        Optional<CelularPrePago> celularPrePago = celularPrePagoRepository.findById(id);
        return  celularPrePago.orElse(null);
    }

    public CelularPrePago updateCelularPrePago(Long id, CelularPrePago updateCelularPrePago) {
        Optional<CelularPrePago> celularPrePago = celularPrePagoRepository.findById(id);
        if (celularPrePago.isPresent()) {
            CelularPrePago existingCelularPrePago = celularPrePago.get();
            existingCelularPrePago.setSaldo(updateCelularPrePago.getSaldo());
            existingCelularPrePago.setCliente(updateCelularPrePago.getCliente());
            existingCelularPrePago.setLigacoes(updateCelularPrePago.getLigacoes());
            existingCelularPrePago.setNumero(updateCelularPrePago.getNumero());
            existingCelularPrePago.setPlano(updateCelularPrePago.getPlano());
            existingCelularPrePago.setDataDeValidade(updateCelularPrePago.getDataDeValidade());
            return celularPrePagoRepository.save(existingCelularPrePago);
        } else {
            return null;
        }
    }

        public void deleteCelularPrePago(Long id){
            celularPrePagoRepository.deleteById(id);

        }


}
