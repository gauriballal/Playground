import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	     Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int i;
         for(i=1 ; i <= n ; i++)
         {
            if(i%2==1)
              System.out.println(i);
         }
	}
}