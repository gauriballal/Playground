import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
   public static void main(String a[])throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> tsst = new TreeSet<String>();
      String m = br.readLine();
      String[] arr = m.split(",");
      System.out.println("Duplicate Entry is: "); 
      for (String str : arr) 
      {
         if (!tsst.add(str)) 
         {
            System.out.println(str);
         }
      }
      System.out.println("TreeSet is : " + tsst);  
   }
}