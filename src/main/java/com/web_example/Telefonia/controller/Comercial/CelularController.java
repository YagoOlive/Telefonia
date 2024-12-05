package com.web_example.Telefonia.controller.Comercial;


import com.web_example.Telefonia.Model.Comercial.Celular;
import com.web_example.Telefonia.Services.ServiceComercial.CelularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/celular")
public class CelularController {

    @Autowired
    private CelularService celularService;

    @PostMapping
    public Celular createCelular(@RequestBody Celular celular) {
        return celularService.saveCelular(celular);
    }

    @GetMapping
    public List<Celular> getAllCelulares() {
        return celularService.getAllCelular();
    }

    @GetMapping("/{id}")
    public Celular getCelularById(@PathVariable Long id) {
        return celularService.getCelularById(id);
    }

    @PutMapping("/{id}")
    public Celular updateCelular(@PathVariable Long id, @RequestBody Celular celular) {
        return celularService.updateCelular(id, celular);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCelular(@PathVariable Long id) {
        celularService.deleteCelular(id);
        return ResponseEntity.ok().build();
    }
}
