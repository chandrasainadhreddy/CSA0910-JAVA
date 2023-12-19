import java.util.*;
import java.io.*;
class invertedrightTriangle
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no.of rows");
    int n = sc.nextInt();
    int i,j;
    for(i=0;i<n;i++)
    {
      for(j=i;j<n;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
    
