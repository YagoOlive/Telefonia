package com.web_example.Telefonia.controller.Comercial;

import com.web_example.Telefonia.Model.Comercial.Ligacao;
import com.web_example.Telefonia.Services.ServiceComercial.LigacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ligacao")
public class LigacaoController {

    @Autowired
    private LigacaoService ligacaoService;

    @PostMapping
    public Ligacao createLigacao(@RequestBody Ligacao ligacao) {
        return ligacaoService.saveLigacao(ligacao);
    }

    @GetMapping
    public List<Ligacao> getAllLigacoes() {
        return ligacaoService.getAllLigacoes();
    }

    @GetMapping("/{id}")
    public Ligacao getLigacaoById(@PathVariable Long id) {
        return ligacaoService.getLigacaoById(id);
    }

    @PutMapping("/{id}")
    public Ligacao updateLigacao(@PathVariable Long id, @RequestBody Ligacao ligacao) {
        return ligacaoService.updateLigacao(id, ligacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLigacao(@PathVariable Long id) {
        ligacaoService.deleteLigacao(id);
        return ResponseEntity.ok().build();
    }
}
