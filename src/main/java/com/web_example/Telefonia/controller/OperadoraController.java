package com.web_example.Telefonia.controller;

import com.web_example.Telefonia.Model.Operadora;
import com.web_example.Telefonia.Services.OperadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/operadora")
public class OperadoraController {

        @Autowired
        OperadoraService operadoraService;

        @PostMapping
        public Operadora createOperadora(@RequestBody Operadora operadora){
            return operadoraService.saveOperadora(operadora);
        }

        @GetMapping
        public List<Operadora> getAllOperadoras(){
            return operadoraService.getAllOperadoras();
        }

        @GetMapping("/{id}")
        public Operadora getOperadoraById(@PathVariable Long id){
            return operadoraService.getOperadoraById(id); }

        @PutMapping("/{id}")
        public Operadora updateOperadora(@PathVariable Long id, @RequestBody Operadora operadora){
            return operadoraService.updateOperadora(id, operadora);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> deleteOperadora(@PathVariable Long id) {
            operadoraService.deleteOperadora(id);
            return ResponseEntity.ok().build();
        }

}
