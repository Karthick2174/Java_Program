import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
class Myclass 
{
  public static void main (String [] args)throws IOException
  {
    Scanner sc = new Scanner(System.in);
    for (int ch=1;ch<5;ch++)
    {
      String name = "karthick";
      long account_number = 754712651334681L;
      long card_number = 4125894336546375L;
      int account_balance = 864265;
      long mobile_number = 9784351260L;
      int withdraw_amount, cash_deposite, op;
      System.out.println("Welcome to Bank ATM);
     System.out.println("Please insert a card);
     boolean insert_card = true;
     System.out.println("Please a entre a PIN :);
     int a = sc.nextInt();       // PIN 2585                   
     a= a<<1;
     int b= 5170;
     int otp = generateOTP();
     System.out.println("Entre your OTP : "); 
     int otp1 = sc.nextInt();
    if (otp==otp1)
    {
      if (a==b)
      {
        System.out.println("PIN is correct");
System.out.println("Entre a option" + "\n 1. Money withdraw" + "\n 2. Fast withdraw" + "\n 3. Change a PIN" + "\n 4. Change a mobile number" + "\n 5. Check balance" + "\n 6. Cash deposite");
        op = sc.nextInt();
        if (op==1)
        {
          System.out.println("Money withdraw");
          System.out.println("Entre a money");
          withdraw_amount = sc.nextInt();
          if (account_balance>=withdraw_amount)
          {
            account_balance -=withdraw_amount;
            System.out.println("Account holder name : " + name);
            System.out.println("account balance : " + account_balance);
            else if (account_balance < withdraw_amount)
            {
              system.out.println("Insuffecnt balance");
            }
          }
          if (op==2)
          {
            System.out.println("Fast withdraw");
            System.out.println("Entre a amount :" + "\n 1. 500" + "\n 2.1000" + "\n 3.2000" + "\n 4. 5000" + "\n 5. 10000");
            withdraw_amount = sc.nextInt();
            if (account_balance>= withdraw_amount)
            {
              switch(withdraw_amount)
              {
                case 500: case 1000: case 2000: case 5000: case 10000:
                  System.out.println("Collect your cash" + withdraw_amount);
                  account_balance-= withdraw_amount;
                  System.out.println("Account holder name : " + name);
                  System.out.println("Card number : " + card_number);
                  System.out.println("Account balance" + account_balance);
                  default :
                  System.out.println("Please entre a correct amount");
              }           
            }
            if (account_balance < withdraw_amount)
            {
              System.out.println("Insuffcent balance");
            }
          }
          else if (op==3)
          {
            System.out.println("Change a PIN");
            System.out.println("Entre your current PIN");
            a= scan.nextInt();
            int temp = a<<1;
            if (temp==b)
            {
              System.out.println("Entre a new PIN");
              a= sc.nextInt();
              System.out.println("Entea a PIN");
              int a1 = sc.nextInt();
              if (a==a1) 
              {
                System.out.println("Your PIN is changed suessfully");
                b=a<<1;
              }
            }
            System.out.println("Current PIN : " + a);
          }
          else if (op==4)
          {
            System.out.println("Change a mobile number");
            System.out.println("Entre a new mobile number");
            long new_mobile_number = sc.nextInt();
            mobile_number = new_mobile_number;
            System.out.println("Your new mobile number" + new_mobile_number);
          }
          else if (op==5)
          {
            System.out.println("Check balance : " + account_balance);
          }
          else if (op==6)
          {
            System.out.println("Please put a cash");
            cash_deposite = sc.nextInt();
            account_balance += cash_deposite;
            sc.close;
            System.out.println("======================");
            System.out.println("\t");
            System.out.println("\t Bank");
            System.out.println("\t Branch");
            System.out.println("\t Name :" + name);
            System.out.println("Card number : " + card_number);
            System.out.println("Account number : " + account_number);
            System.out.println("Account balance : " + account_balance);
            System.out.println("\t");
          }
        }
        else if (a!=b)
        {
          System.out.println("PIN is not correct, please check a PIN........................");
        }
      }
      System.out.println("Continue the transtation.....................");
      boolean h= true;
    }
                        }
                        public static int generateOTP()
                        {
                          int otpNo = (int) (Math.random()*9000)+1000;
                          return otpNo;
                        }
                        }
                
                
