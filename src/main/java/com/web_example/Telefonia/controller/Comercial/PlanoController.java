package com.web_example.Telefonia.controller.Comercial;

import com.web_example.Telefonia.Model.Comercial.Plano;
import com.web_example.Telefonia.Services.ServiceComercial.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plano")
public class PlanoController {

    @Autowired
    private PlanoService planoService;

    @PostMapping
    public Plano createPlano(@RequestBody Plano plano) {
        return planoService.savePlano(plano);
    }

    @GetMapping
    public List<Plano> getAllPlanos() {
        return planoService.getAllPlanos();
    }

    @GetMapping("/{id}")
    public Plano getPlanoById(@PathVariable Long id) {
        return planoService.getPlanoById(id);
    }

    @PutMapping("/{id}")
    public Plano updatePlano(@PathVariable Long id, @RequestBody Plano plano) {
        return planoService.updatePlano(id, plano);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePlano(@PathVariable Long id) {
        planoService.deletePlano(id);
        return ResponseEntity.ok().build();
    }
}

