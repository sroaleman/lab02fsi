package com.udea.lab2aerolinea.model;

public class Passenger {

    private String name;
    private int age;
    // Basic, Silver, Gold, Platinum
    private String membershipLevel;
    // "Any", "Window", "Aisle", "EmergencyExit", "None"
    private String seatPreference;
    private boolean travelingWithChildren;

    // Campos que las reglas van modificando (empiezan en su valor "neutro")
    private boolean eligibleForUpgrade = true;
    private boolean upgradedToBusiness = false;
    private boolean priorityCheckIn = false;
    private boolean vipLoungeAccess = false;
    private boolean preferentialFamilySeat = false;
    private String assignedSeat = "";
    private double discountPercentage = 0.0;
    private double compensationAmount = 0.0;
    private int loyaltyPoints = 0;

    public Passenger() {}

    public Passenger(String name, int age, String membershipLevel,
                      String seatPreference, boolean travelingWithChildren) {
        this.name = name;
        this.age = age;
        this.membershipLevel = membershipLevel;
        this.seatPreference = seatPreference;
        this.travelingWithChildren = travelingWithChildren;
    }

    // Getters y Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getMembershipLevel() { return membershipLevel; }
    public void setMembershipLevel(String membershipLevel) { this.membershipLevel = membershipLevel; }

    public String getSeatPreference() { return seatPreference; }
    public void setSeatPreference(String seatPreference) { this.seatPreference = seatPreference; }

    public boolean isTravelingWithChildren() { return travelingWithChildren; }
    public void setTravelingWithChildren(boolean travelingWithChildren) { this.travelingWithChildren = travelingWithChildren; }

    public boolean isEligibleForUpgrade() { return eligibleForUpgrade; }
    public void setEligibleForUpgrade(boolean eligibleForUpgrade) { this.eligibleForUpgrade = eligibleForUpgrade; }

    public boolean isUpgradedToBusiness() { return upgradedToBusiness; }
    public void setUpgradedToBusiness(boolean upgradedToBusiness) { this.upgradedToBusiness = upgradedToBusiness; }

    public boolean isPriorityCheckIn() { return priorityCheckIn; }
    public void setPriorityCheckIn(boolean priorityCheckIn) { this.priorityCheckIn = priorityCheckIn; }

    public boolean isVipLoungeAccess() { return vipLoungeAccess; }
    public void setVipLoungeAccess(boolean vipLoungeAccess) { this.vipLoungeAccess = vipLoungeAccess; }

    public boolean isPreferentialFamilySeat() { return preferentialFamilySeat; }
    public void setPreferentialFamilySeat(boolean preferentialFamilySeat) { this.preferentialFamilySeat = preferentialFamilySeat; }

    public String getAssignedSeat() { return assignedSeat; }
    public void setAssignedSeat(String assignedSeat) { this.assignedSeat = assignedSeat; }

    public double getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(double discountPercentage) { this.discountPercentage = discountPercentage; }

    public double getCompensationAmount() { return compensationAmount; }
    public void setCompensationAmount(double compensationAmount) { this.compensationAmount = compensationAmount; }

    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
}