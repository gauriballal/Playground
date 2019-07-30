import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
   public static void main(String args[])throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> tset = new TreeSet<String>();
      String value = br.readLine();
      String[] arr = value.split(",");
      for(int i = 0 ; i<arr.length ; i++)
      {
         tset.add(arr[i]);
      }
      System.out.println(tset);
      Object arr1[] = tset.toArray();
      int n = arr1.length-1;
      while(tset.isEmpty()!=true)
      {
         Object b = arr1[n];
         tset.remove(b);
         System.out.println(tset);
         --n;
      }
   }
}