package com.udea.lab2aerolinea.service;

import com.udea.lab2aerolinea.model.AirlineRequest;
import com.udea.lab2aerolinea.model.AirlineResponse;
import com.udea.lab2aerolinea.model.Seat;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineEvaluationService {

    @Autowired
    private KieContainer kieContainer;

    public AirlineResponse evaluate(AirlineRequest request) {
        KieSession kieSession = kieContainer.newKieSession();
        try {
            // Vincula el nombre del pasajero al vuelo y al equipaje para que los joins de las reglas funcionen
            request.getFlight().setPassengerName(request.getPassenger().getName());
            request.getLuggage().setPassengerName(request.getPassenger().getName());

            kieSession.insert(request.getPassenger());
            kieSession.insert(request.getFlight());
            kieSession.insert(request.getLuggage());

            if (request.getSeat() != null) {
                kieSession.insert(request.getSeat());
            } else {
                // Asiento de emergencia disponible por defecto, para poder probar la regla 5 sin enviarlo
                kieSession.insert(new Seat("EmergencyExit", true));
            }

            kieSession.fireAllRules();
        } finally {
            kieSession.dispose();
        }
        return new AirlineResponse(request.getPassenger(), request.getLuggage());
    }
}