package com.udea.lab2aerolinea.model;

public class Luggage {

    private String passengerName;
    private double weightKg;
    private boolean allowed = true;

    public Luggage() {}

    public Luggage(String passengerName, double weightKg) {
        this.passengerName = passengerName;
        this.weightKg = weightKg;
    }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public double getWeightKg() { return weightKg; }
    public void setWeightKg(double weightKg) { this.weightKg = weightKg; }

    public boolean isAllowed() { return allowed; }
    public void setAllowed(boolean allowed) { this.allowed = allowed; }
}