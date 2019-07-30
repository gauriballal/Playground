import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      try
      {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
	     System.out.println(n);
      }
      catch(InputMismatchException e)
      {
	     System.out.println("Input Mismatch Exception occurred");
      }
   }
}