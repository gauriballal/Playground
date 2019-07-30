import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
	   Scanner scan=new Scanner(System.in);
       int num=scan.nextInt();
       int sum = addNumbers(num);
       System.out.println(sum);
    }
    public static int addNumbers(int num)
    {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
}