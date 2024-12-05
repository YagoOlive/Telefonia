package com.web_example.Telefonia.controller.Comercial;

import com.web_example.Telefonia.Model.Comercial.CelularPosPago;
import com.web_example.Telefonia.Services.ServiceComercial.CelularPosPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/celular-pos-pago")
public class CelularPosPagoController {

    @Autowired
    private CelularPosPagoService celularPosPagoService;

    @PostMapping
    public CelularPosPago createCelularPosPago(@RequestBody CelularPosPago celularPosPago) {
        return celularPosPagoService.saveCelularPosPago(celularPosPago);
    }

    @GetMapping
    public List<CelularPosPago> getAllCelularesPosPago() {
        return celularPosPagoService.getAllCelularPosPago();
    }

    @GetMapping("/{id}")
    public CelularPosPago getCelularPosPagoById(@PathVariable Long id) {
        return celularPosPagoService.getCelularPosPagoById(id);
    }

    @PutMapping("/{id}")
    public CelularPosPago updateCelularPosPago(@PathVariable Long id, @RequestBody CelularPosPago celularPosPago) {
        return celularPosPagoService.updateCelularPosPago(id, celularPosPago);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCelularPosPago(@PathVariable Long id) {
        celularPosPagoService.deleteCelularPosPago(id);
        return ResponseEntity.ok().build();
    }
}

