import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test {

    public static void main(String[] args) {
    	System.out.println("Entre a number : ");
    	Scanner sc = new Scanner(System.in);
    	int i = sc.nextInt();
      while(i<=40) {
          if (i%3==0 && i%5==0)
              System.out.println("FizzBuzz");
          else if (i%3 == 0)
    	   System.out.println("Fizz");
       else if (i%5==0)
    	   System.out.println("Buzz");
       else
    	   System.out.println(i);
          i++;
    	  } 
    }
}
