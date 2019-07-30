import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int factorial = 1 , i;
        for(i = 1 ; i <= num ; i++)
        {
           factorial = factorial * i;  
        }
        System.out.println(factorial);
	}
}