import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int i;
     for(i = 1 ; i <= n ; i++)
     {
       System.out.print(i);
        if(i%3==0)
          System.out.print(",");
     }
  }
}