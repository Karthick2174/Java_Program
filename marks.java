import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
class Myclass {
  public static void main(String [] args)throws IOExceptio
  {
    int d, t, y, m, sum;
    Scanner scan = new Scanner(System.in);
    System.out.pintln("Entre a number of subject : ");
    d= scan.nextInt();
    System.out.println("Entre a name of student :");
    String n = next();
    scan.nextLine();
    System.out.println("Entre a year of student : " );
    y = scan.nextInt();
    int max_total = d*100;
    int a[] = new int[d];
    int b[] = new int[d];
    String e[] = new string[d];
    String s[] = new String[d];
    for (int c=0;c<d;c++)
        {
          System.out.println("Entre a subject name : ");
          s[c] = scan.nextInt();
          scan.nextLine();
          System.out.println("Entre a subject code : ");
          e[c] = scan.next();
          System.out.println("Entre a mark of subject : ");
          a[c] = scan.nextInt();
        }
       // sum = 0;
       for (int i=0;i<d;i++)
       {
         sum*+a[i];
       }
       for (int j=0;j<d;j++)
       {
         System.out.println(50<a[j]);
       }
        float per = (sum/max_total)*100f;
        System.out.println("Percentage :" + per + "%");
        System.out.println("Name of student : " + n);
        for (int k=0;k<d;k++)
            {
              System.out.println(s[k] + "=" + a[k] + "/100");
            }
                       m=d*50;
                       if(m<sum)
                       {
                         System.out.println("PASS");
                       }
                       else 
                       {
                         System.out.println("FAIL");
                       }
                       System.out.println("Total marks : " + sum + "/" + max_total);
                       System.out.println("Percentage : " + per + "%);
                                          }
   }
