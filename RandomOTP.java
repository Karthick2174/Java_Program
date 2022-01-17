import java.math.*;
public class mycalss
{
    public static void generateOTP()
    {
        int otpNo = (int)(Math.random()*900000)+100000;
        System.out.println("Six digit OTP : " + otpNo); 
    }
        public static void main(String []args)
        {
        generateOTP();          // calling method
        }
    }
