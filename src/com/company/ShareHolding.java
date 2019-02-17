package com.company;

public class ShareHolding {

    private double price;
    private int quantity;

    public ShareHolding(double initialPrice, int initialQty) {
        price = initialPrice;
        quantity = initialQty;
    }

    public void changePrice(double newPrice) {
    	price = newPrice;
    }

    public void changeQty(int newQty) {
    	quantity = newQty;
    }

    public double getValue() {
    	return quantity*price;
    }
}
