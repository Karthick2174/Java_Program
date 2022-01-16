import java.io.*;
import java.util.*;
class Myclass {
  public static void main(String []th)throws IOException {
    HashMap<String, integer> empId = new HashMap<>();
   Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int NA = sc.nextInt();
    empId.put(N, NA);
    empId.put("Karthick" , 2174);
    empId.put("Shas", 0123);
    empId.put("Subhas",5628);
    empId.put("Hari",8266);
    empId.put("John",8265);
    System.out.println(empId);
    System.out.println(empId.get("Shas"));
    System.out.println(empId.containsKey("Subha"));
    System.out.println(empId.containsKey(0986);
    System.out.println(empId.containsKey("Shas"));
    System.out.println(empId.containsValue(0123));
    System.out.println(empId);                   
    empId.replace("Jerry", 0125);
    System.out.println(empId);                   
    empId.replace("John", 8165);
    System.out.println(empId);                   
    empId.putIfAbsent("Gokul",8526);
    System.out.println(empId);
    empId.remove("Gokul"); 
    System.out.println(empId);
     }
}
