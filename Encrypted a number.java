// This program encrypt a number using BITWISE operator
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
class Myclass {
   public static void main(String [] args)throws IOException  {
   Scanner scan = new Scanner(system.in);
   int x = scan.nextInt();    // How many time we want rotation on a number;
   System.out.println("How much rotate a number : ");
   int y = scan.nextInt();
   Sytem.out.println("How much rotate a number like Ex.two or three rotate" + "\n 1. Left shift 2 times" + "/n 2. Left shift 3 times" + "\n 3. Right shift 2 time." + "\n 4. Right shift 3 times.");
   switch (x)
   case 1: { 
   System.out.println("Left shift a number of" + x + "How much rotate a valve" + y + " : ");
   int a = x<<y;
   System.out.println("The valve of : " + a); 
   break;
   }
    case 2: { 
   System.out.println("Left shift a number of" + x + "How much rotate a valve" + y + " : ");
   int a = x<<<y;
   System.out.println("The valve of : " + a); 
   break;
   }
    case 3: { 
   System.out.println("Right shift a number of" + x + "How much rotate a valve" + y + " : ");
   int a = x>>y;
   System.out.println("The valve of : " + a); 
   break;
   }
    case 4: { 
   System.out.println("Right shift a number of" + x + "How much rotate a valve" + y + " : ");
   int a = x>>>y;
   System.out.println("The valve of : " + a); 
   break;
   }
   }
} 