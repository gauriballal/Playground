import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++)
        {
            arr[idx] = scan.nextInt();
        }
        int frequency[] = new int[k];
        for(int i = 0; i <= k - 1; i++)
        {
            frequency[i] = 0;
        }
        for(int idx = 0; idx <= n - 1; idx++)
        {
           frequency[arr[idx] - 1]++;
        }
        for(int idx = 0; idx <= k - 1; idx++)
        {
           System.out.println((idx + 1) + " " + frequency[idx]);
        }
    }
}