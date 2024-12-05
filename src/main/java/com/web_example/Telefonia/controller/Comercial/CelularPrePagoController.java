package com.web_example.Telefonia.controller.Comercial;

import com.web_example.Telefonia.Model.Comercial.CelularPrePago;
import com.web_example.Telefonia.Services.ServiceComercial.CelularPrePagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/celular-pre-pago")
public class CelularPrePagoController {

    @Autowired
    private CelularPrePagoService celularPrePagoService;

    @PostMapping
    public CelularPrePago createCelularPrePago(@RequestBody CelularPrePago celularPrePago) {
        return celularPrePagoService.saveCelularPrePago(celularPrePago);
    }

    @GetMapping
    public List<CelularPrePago> getAllCelularesPrePago() {
        return celularPrePagoService.getAllCelularPrePago();
    }

    @GetMapping("/{id}")
    public CelularPrePago getCelularPrePagoById(@PathVariable Long id) {
        return celularPrePagoService.getCelularPrePagoById(id);
    }

    @PutMapping("/{id}")
    public CelularPrePago updateCelularPrePago(@PathVariable Long id, @RequestBody CelularPrePago celularPrePago) {
        return celularPrePagoService.updateCelularPrePago(id, celularPrePago);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCelularPrePago(@PathVariable Long id) {
        celularPrePagoService.deleteCelularPrePago(id);
        return ResponseEntity.ok().build();
    }
}

