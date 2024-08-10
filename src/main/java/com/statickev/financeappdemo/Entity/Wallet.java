package com.statickev.financeappdemo.Entity;

public class Wallet {
    private double balance;
    private double savedAmount;

    public double getBalance() throws IllegalArgumentException {
        return balance;
    }

    public void setBalance(double balance) throws IllegalArgumentException {
        if (balance < 0) throw new IllegalArgumentException("Cup can't be negative!");
        else this.balance = balance;
    }

    public double getSavedAmount() {
        return savedAmount;
    }

    public void setSavedAmount(double amount) throws IllegalArgumentException {
        if (amount < 0) throw new IllegalArgumentException("Amount can't be negative!");
        else this.savedAmount = amount;
    }

}
