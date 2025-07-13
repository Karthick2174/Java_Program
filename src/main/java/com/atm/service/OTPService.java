package com.atm.service;

import java.util.Random;

public class OTPService {
    private static final Random random = new Random();
    private int currentOTP;

    public int generateOTP() {
        currentOTP = 1000 + random.nextInt(9000);
        return currentOTP;
    }

    public boolean validateOTP(int enteredOTP) {
        return currentOTP == enteredOTP;
    }

    public void clearOTP() {
        currentOTP = 0;
    }
}