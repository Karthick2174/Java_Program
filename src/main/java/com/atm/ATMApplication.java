package com.atm;

import com.atm.model.Account;
import com.atm.service.ATMService;

public class ATMApplication {
    public static void main(String[] args) {
        // Create a sample account
        Account account = new Account(
            "Karthick Kumar",
            754712651334681L,
            4125894336546375L,
            9784351260L,
            864265,
            2585
        );
        
        // Start ATM service
        ATMService atmService = new ATMService(account);
        atmService.startATMSession();
    }
}