package com.udea.lab2aerolinea.model;
 
public class AirlineResponse {
 
    private Passenger passenger;
    private Luggage luggage;
 
    public AirlineResponse() {}
 
    public AirlineResponse(Passenger passenger, Luggage luggage) {
        this.passenger = passenger;
        this.luggage = luggage;
    }
 
    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }
 
    public Luggage getLuggage() { return luggage; }
    public void setLuggage(Luggage luggage) { this.luggage = luggage; }
}
 