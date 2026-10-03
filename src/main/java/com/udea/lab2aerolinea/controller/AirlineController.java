package com.udea.lab2aerolinea.controller;

import com.udea.lab2aerolinea.model.AirlineRequest;
import com.udea.lab2aerolinea.model.AirlineResponse;
import com.udea.lab2aerolinea.service.AirlineEvaluationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airline")
public class AirlineController {

    @Autowired
    private AirlineEvaluationService evaluationService;

    @PostMapping("/api/evaluate")
    public Object evaluate(@Valid @RequestBody AirlineRequest request, BindingResult result) {
        if (result.hasErrors()) {
            String errorMessage = result.getAllErrors().stream()
                    .map(error -> error.getDefaultMessage())
                    .reduce((m1, m2) -> m1 + "; " + m2)
                    .orElse("Errores de validación");
            return "Error de validación: " + errorMessage;
        }
        AirlineResponse resultado = evaluationService.evaluate(request);
        return resultado;
    }
}