package com.udea.lab2aerolinea.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class AirlineRequest {

    @NotNull(message = "El pasajero es obligatorio")
    @Valid
    private Passenger passenger;

    @NotNull(message = "El vuelo es obligatorio")
    private Flight flight;

    @NotNull(message = "El equipaje es obligatorio")
    private Luggage luggage;

    // Opcional: solo se usa en la prueba de la regla 5 (asiento de emergencia)
    private Seat seat;

    public AirlineRequest() {}

    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }

    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }

    public Luggage getLuggage() { return luggage; }
    public void setLuggage(Luggage luggage) { this.luggage = luggage; }

    public Seat getSeat() { return seat; }
    public void setSeat(Seat seat) { this.seat = seat; }
}