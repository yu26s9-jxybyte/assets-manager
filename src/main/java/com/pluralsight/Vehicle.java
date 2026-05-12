package com.pluralsight;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {

        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }

    public int getOdometer() {
        return odometer;
    }

    public double getValue() {
        int age = 2026 - year;
        double value = getOriginalCost();

        if (age <= 3) {
            value -= value * (0.03 * age);
        } else if (age <= 6) {
            value -= value * (0.06 * age);
        } else if (age <= 10) {
            value -= value * (0.08 * age);
        } else {
            value = 1000;
        }

        if (odometer > 100000 &&
                !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75;
        }

        return value;
    }
}

