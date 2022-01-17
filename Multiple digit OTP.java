import java.math.*;
import java.util.*;
class Mycalss{
    public static void generateOTP()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre how much digit OTP :" + "\n 1. 4.digit OTP" + "\n 2. 5.digit OTP" + "\n 3. 6.digit OTP" + "\n 4. 7.digit OTP" + "\n 5.8.digit OTP");
        int x = scan.nextInt();
            if (x==1) 
            {
int otpNo = (int)(Math.random()*9000)+1000;
System.out.println("Your 4 digit OTP : " + otpNo);
}
 else if (x==2) 
 {
int otpNo = (int)(Math.random()*90000)+10000;
System.out.println("Your 5 digit OTP : " + otpNo);
}
else if (x==3) 
{
int otpNo = (int)(Math.random()*900000)+100000;
System.out.println("Your 6 digit OTP : " + otpNo);
}
else if (x==4)
{
int otpNo = (int)(Math.random()*9000000)+1000000;
System.out.println("Your 7 digit OTP : " + otpNo);
}
else if (x==5) 
{
int otpNo = (int)(Math.random()*90000000)+10000000;
System.out.println("Your 8 digit OTP : " + otpNo);
}
    }
    public static void main(String []args)
   {
    generateOTP();    //calling method
   }   
}
