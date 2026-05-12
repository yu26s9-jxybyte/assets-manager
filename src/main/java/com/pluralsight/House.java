package com.pluralsight;

public class House extends Asset {

    private String address;
    private int condition;   // 1=excellent, 2=good, 3=fair, 4=poor
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {

        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public int getCondition() {
        return condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    @Override
    public double getValue() {
        double baseValue = 0;

        switch (condition) {
            case 1: baseValue = squareFoot * 180; break;
            case 2: baseValue = squareFoot * 130; break;
            case 3: baseValue = squareFoot * 90; break;
            case 4: baseValue = squareFoot * 80; break;
        }

        double lotValue = lotSize * 0.25;

        return baseValue + lotValue;
    }
}
