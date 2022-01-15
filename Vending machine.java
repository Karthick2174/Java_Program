import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
class Myclass
{
  public static void main(string [] args)throws IOException
  {
    Scanner scan = new Scanner(System.in);
    int std = 4262;     // the valve is use for PIN its shift operator valve.
    int put_money = 0;
    String name = "karthick";
    System.out.println("Please press any button in two buttons." + "\n 1. Put a money on the hole." + "\n 2. Insert a card in a card place.");
    int b = scan.nextInt();
    if(b==1)
    {
         System.out.println("please put your amount : ");
         put_money = scan.nextInt();
         System.out.println("Your amount is :" + put_money);
         }
            else(b==2)  {
                          System.out.println("Please insert a CARD : ");
                           System.out.println("Please wait for checking for your card................");
                           System.out.println("Please entre a PIN.");
                           int PIN = scan.nextInt();
                           PIN>>1;    //8525
                           String Collect = "Take your drink";
                          if(PIN==std) {
                                        System.out.println("PIN is correct");
                                        int cdr = 82;
                                        int psr = 83;
                                        int tsr = 125;
                                        int wr = 2;
                                        System.out.println("*All Juice are contain 250ML only");
                                        System.out.println("Entre you want a drink." + "\n 1. Cool drink." + "\n 2. Plain soda." + "\n 3. Today special." + "\n 4. Water" + "\n");
                                        System.out.println("Select your drink");
                                        int Select = scan.nextInt();
System.out.println("Please put a cash in cash box" + "\n We only a allow  amount of Rounded amount not accepted in paise" + "\n Ex: Only a 1, 5, 10, 100" + "\t Not in .50 paise");                               
                                       int Rate = scan.nextInt();
                                        switch (Select)
                                        case (1 && (Rate == 82))  {
                                        System.out.print(Collect);
                                        break;
                                         }
                                         case (2 && (Rate==83)) {
                                         System.out.print(Collect);
                                         break;
                                         }
                                         case (3 && (Rate== 125)) {
                                         System.out.print(Collect);
                                         break;
                                         }
                                         case (4 &&(Rate== 2))  {
                                         System.out.print(Collect);
                                         break;
                                         }
                                         default  {
                                         System.out.print("Please put a correct amount................");
                                         }
                                }
                                            else {
                                                   System.out.println("PIN is not correct")
                                                      }
     }                              
}
