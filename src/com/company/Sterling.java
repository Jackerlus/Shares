package com.company;

public class Sterling {
    private double value;

    public Sterling(double initialVal) {
        value = initialVal;
    }

    public double getValue() {
        return value;
    }

    public void add(double addition) {
        value += addition;
    }

    public void percentageChange(double percentage) {
        double val = percentage / 100;
        value *= (1 + val);
    }
}
