package com.udea.lab2aerolinea.model;

public class Seat {

    // Ej: "EmergencyExit", "Window", "Aisle"
    private String type;
    private boolean available = true;
    private boolean occupied = false;

    public Seat() {}

    public Seat(String type, boolean available) {
        this.type = type;
        this.available = available;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public boolean isOccupied() { return occupied; }
    public void setOccupied(boolean occupied) { this.occupied = occupied; }
}