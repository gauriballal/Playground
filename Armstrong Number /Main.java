import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       int i , rem , sum=0 ,  temp;
       temp = num;
       while(num > 0)
       {
          rem = num % 10;
          num = num / 10;
          sum = sum + (rem * rem * rem);
       }
       if(temp == sum)
          System.out.println("Armstrong Number");
       else
         System.out.println("Not a Armstrong Number");
	}
}