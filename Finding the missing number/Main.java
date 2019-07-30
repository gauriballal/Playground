import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <= n - 1; i++)
        {
            arr[i	] = scan.nextInt();
        }
        int value = 0;
        for(int val = 1; val <= n; val++)
        {
            boolean found = false;
            for(int indx = 0; indx <= n - 1; indx++)
            {
                if(arr[indx] == val)
                {
                    found = true;
                    break;
                }
            }
            if(found == false)
            {
                value = val;
                break;
            }
        }
        System.out.print(value);
    }
}