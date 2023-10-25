package de.ait.homework40;

import java.util.HashMap;

public class Drink {
    private String name;
    private String type;
    private double volume;

    public Drink(String name, String type, double volume) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("The name of the beverage should not be empty");
        }
        else if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("The type of the beverage should not be empty");
        }
        else if (volume <= 0) {
            throw new IllegalArgumentException("The volume of beverage should be positive");
        }
        else {
            this.name = name;
            this.type = type;
            this.volume = volume;
        }

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                '}';
    }
}
