import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int starcount;
     for(starcount = 1 ; starcount <= n ; starcount++)
       System.out.println("*");
  }
}