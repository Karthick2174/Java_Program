package com.atm.model;

public class Account {
    private final String accountHolderName;
    private final long accountNumber;
    private final long cardNumber;
    private final long mobileNumber;
    private int balance;
    private int pin;

    public Account(String accountHolderName, long accountNumber, long cardNumber, 
                   long mobileNumber, int balance, int pin) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public int getBalance() {
        return balance;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public void changePin(int newPin) {
        this.pin = newPin;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public String getMaskedCardNumber() {
        String cardStr = String.valueOf(cardNumber);
        return "**** **** **** " + cardStr.substring(cardStr.length() - 4);
    }
}