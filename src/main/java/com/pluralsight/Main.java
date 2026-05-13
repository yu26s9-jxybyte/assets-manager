package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        // --- Add Houses ---
        assets.add(new House(
                "My primary house",
                "2018-06-12",
                250000,
                "123 Main St",
                2,
                1800,
                5000
        ));

        assets.add(new House(
                "Vacation home",
                "2020-03-10",
                320000,
                "88 Beach Drive",
                1,
                2200,
                8000
        ));

        // --- Add Vehicles ---
        assets.add(new Vehicle(
                "My car",
                "2022-01-05",
                28000,
                "Honda Civic",
                2021,
                45000
        ));

        assets.add(new Vehicle(
                "Tom's truck",
                "2015-09-20",
                35000,
                "Ford F-150",
                2014,
                150000
        ));

        // --- Loop through assets ---
        for (Asset a : assets) {
            System.out.println("-----------------------------");
            System.out.println("Description: " + a.getDescription());
            System.out.println("Date Acquired: " + a.getDateAcquired());
            System.out.println("Original Cost: $" + a.getOriginalCost());
            System.out.println("Current Value: $" + a.getValue());

            // instanceof + downcast
            if (a instanceof House) {
                House h = (House) a;
                System.out.println("Address: " + h.getAddress());
            } else if (a instanceof Vehicle) {
                Vehicle v = (Vehicle) a;
                System.out.println("Year/Make/Model: " + v.getYear() + " " + v.getMakeModel());
            }
        }
    }
}

