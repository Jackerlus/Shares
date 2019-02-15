package com.company;

public class Sterling {
    private double value;

    public Sterling(double initialVal) {
        value = initialVal;
    }

    public double getValue() {
        return value;
    }

    public double add(double addition) {
        return value + addition;
    }

    public double percentageChange(double percentage) {
        double val = percentage / 100;
        return value * (1 + val);
    }
}
