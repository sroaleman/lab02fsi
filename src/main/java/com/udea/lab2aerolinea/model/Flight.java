package com.udea.lab2aerolinea.model;

public class Flight {

    // Nombre del pasajero al que pertenece este vuelo (para hacer el join en Drools)
    private String passengerName;
    private int delayMinutes;
    private double durationHours;

    public Flight() {}

    public Flight(String passengerName, int delayMinutes, double durationHours) {
        this.passengerName = passengerName;
        this.delayMinutes = delayMinutes;
        this.durationHours = durationHours;
    }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public int getDelayMinutes() { return delayMinutes; }
    public void setDelayMinutes(int delayMinutes) { this.delayMinutes = delayMinutes; }

    public double getDurationHours() { return durationHours; }
    public void setDurationHours(double durationHours) { this.durationHours = durationHours; }
}