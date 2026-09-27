package com.udea.lab2aerolinea.controller;

import com.udea.lab2aerolinea.model.AirlineRequest;
import com.udea.lab2aerolinea.model.Flight;
import com.udea.lab2aerolinea.model.Luggage;
import com.udea.lab2aerolinea.model.Passenger;
import com.udea.lab2aerolinea.service.AirlineEvaluationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/airline")
public class AirlineWebController {

    @Autowired
    private AirlineEvaluationService evaluationService;

    @GetMapping("/form")
    public String showForm(Model model) {
        AirlineRequest airlineRequest = new AirlineRequest();
        airlineRequest.setPassenger(new Passenger());
        airlineRequest.setFlight(new Flight());
        airlineRequest.setLuggage(new Luggage());
        model.addAttribute("airlineRequest", airlineRequest);
        return "airline_form";
    }

    @PostMapping("/evaluate")
    public String evaluateWeb(@Valid AirlineRequest airlineRequest, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "airline_form";
        }
        Passenger resultado = evaluationService.evaluate(airlineRequest);
        model.addAttribute("passenger", resultado);
        return "airline_result";
    }
}