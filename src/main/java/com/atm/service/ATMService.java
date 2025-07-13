package com.atm.service;

import com.atm.model.Account;
import java.util.Scanner;

public class ATMService {
    private final Account account;
    private final OTPService otpService;
    private final Scanner scanner;
    private static final int MAX_PIN_ATTEMPTS = 3;
    private static final int[] FAST_WITHDRAW_AMOUNTS = {500, 1000, 2000, 5000, 10000};

    public ATMService(Account account) {
        this.account = account;
        this.otpService = new OTPService();
        this.scanner = new Scanner(System.in);
    }

    public void startATMSession() {
        System.out.println("=== Welcome to Bank ATM ===");
        System.out.println("Please insert your card...");
        
        if (authenticateUser()) {
            showMainMenu();
        } else {
            System.out.println("Authentication failed. Session terminated.");
        }
        
        scanner.close();
    }

    private boolean authenticateUser() {
        // PIN Authentication
        for (int attempts = 0; attempts < MAX_PIN_ATTEMPTS; attempts++) {
            System.out.print("Please enter your PIN: ");
            int enteredPin = scanner.nextInt();
            
            if (account.validatePin(enteredPin)) {
                System.out.println("PIN verified successfully!");
                break;
            } else {
                System.out.println("Incorrect PIN. Attempts remaining: " + (MAX_PIN_ATTEMPTS - attempts - 1));
                if (attempts == MAX_PIN_ATTEMPTS - 1) {
                    System.out.println("Maximum PIN attempts exceeded. Card blocked.");
                    return false;
                }
            }
        }

        // OTP Authentication
        int otp = otpService.generateOTP();
        System.out.println("OTP sent to your registered mobile: " + otp);
        System.out.print("Enter OTP: ");
        int enteredOTP = scanner.nextInt();
        
        if (otpService.validateOTP(enteredOTP)) {
            System.out.println("OTP verified successfully!");
            otpService.clearOTP();
            return true;
        } else {
            System.out.println("Invalid OTP. Authentication failed.");
            return false;
        }
    }

    private void showMainMenu() {
        boolean continueSession = true;
        
        while (continueSession) {
            System.out.println("\n=== ATM Main Menu ===");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Fast Withdraw");
            System.out.println("3. Change PIN");
            System.out.println("4. Check Balance");
            System.out.println("5. Deposit Cash");
            System.out.println("6. Print Receipt");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    withdrawMoney();
                    break;
                case 2:
                    fastWithdraw();
                    break;
                case 3:
                    changePin();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    depositCash();
                    break;
                case 6:
                    printReceipt();
                    break;
                case 7:
                    continueSession = false;
                    System.out.println("Thank you for using our ATM. Have a great day!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void withdrawMoney() {
        System.out.print("Enter withdrawal amount: ₹");
        int amount = scanner.nextInt();
        
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }
        
        if (amount % 100 != 0) {
            System.out.println("Amount must be in multiples of ₹100.");
            return;
        }
        
        if (account.withdraw(amount)) {
            System.out.println("Transaction successful!");
            System.out.println("Please collect your cash: ₹" + amount);
            System.out.println("Remaining balance: ₹" + account.getBalance());
        } else {
            System.out.println("Insufficient balance. Current balance: ₹" + account.getBalance());
        }
    }

    private void fastWithdraw() {
        System.out.println("=== Fast Withdraw ===");
        for (int i = 0; i < FAST_WITHDRAW_AMOUNTS.length; i++) {
            System.out.println((i + 1) + ". ₹" + FAST_WITHDRAW_AMOUNTS[i]);
        }
        System.out.print("Select amount: ");
        
        int choice = scanner.nextInt();
        
        if (choice >= 1 && choice <= FAST_WITHDRAW_AMOUNTS.length) {
            int amount = FAST_WITHDRAW_AMOUNTS[choice - 1];
            
            if (account.withdraw(amount)) {
                System.out.println("Transaction successful!");
                System.out.println("Please collect your cash: ₹" + amount);
                System.out.println("Remaining balance: ₹" + account.getBalance());
            } else {
                System.out.println("Insufficient balance. Current balance: ₹" + account.getBalance());
            }
        } else {
            System.out.println("Invalid selection.");
        }
    }

    private void changePin() {
        System.out.print("Enter current PIN: ");
        int currentPin = scanner.nextInt();
        
        if (!account.validatePin(currentPin)) {
            System.out.println("Current PIN is incorrect.");
            return;
        }
        
        System.out.print("Enter new PIN (4 digits): ");
        int newPin = scanner.nextInt();
        
        if (String.valueOf(newPin).length() != 4) {
            System.out.println("PIN must be exactly 4 digits.");
            return;
        }
        
        System.out.print("Confirm new PIN: ");
        int confirmPin = scanner.nextInt();
        
        if (newPin == confirmPin) {
            account.changePin(newPin);
            System.out.println("PIN changed successfully!");
        } else {
            System.out.println("PINs do not match. Please try again.");
        }
    }

    private void checkBalance() {
        System.out.println("=== Balance Inquiry ===");
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Current Balance: ₹" + account.getBalance());
    }

    private void depositCash() {
        System.out.print("Enter deposit amount: ₹");
        int amount = scanner.nextInt();
        
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }
        
        account.deposit(amount);
        System.out.println("Cash deposited successfully!");
        System.out.println("New balance: ₹" + account.getBalance());
    }

    private void printReceipt() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("           BANK RECEIPT");
        System.out.println("=".repeat(40));
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Card Number: " + account.getMaskedCardNumber());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: ₹" + account.getBalance());
        System.out.println("Mobile: " + account.getMobileNumber());
        System.out.println("Date: " + java.time.LocalDateTime.now().format(
            java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println("=".repeat(40));
        System.out.println("Thank you for banking with us!");
        System.out.println("=".repeat(40));
    }
}