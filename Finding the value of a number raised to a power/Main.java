import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       int base = scan.nextInt();
       int exponent = scan.nextInt();
       int count = 0,temp = 1;
       while(count < exponent)
       {
          temp = temp * base;
          count++;
       }
       System.out.println(temp);
    }
}