import java.util.*;
import java.io.*;
class reverse
{
   public static void main(String args[])
   {
     String a,b="";
     int i,d=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the string             :");
     a = sc.next();
     d = a.length();
     for(i=d-1;i>=0;i--)
     {
       b=b+a.charAt(i);
     }
     System.out.println("the string before reversing is : "+a);
     System.out.println("the string after reversing is : " +b);
  }
}
