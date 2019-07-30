import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i <= size - 1; i++)
        {
            arr[i] = scan.nextInt();
        }
        int left = 0;
        int right = size - 1;
        boolean palindrome = true;
        while(left <= right)  
        {
            if(arr[left] != arr[right])
            {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(palindrome == true)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}