import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0;i <=size-1;i++)
        {
           arr[i]=in.nextInt();  
        }
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        int e1 = -1;
        int e2 = -1;
        for(int i=0;i<=size-1;i++)
        {
           if(s1==arr[i])
           {
              e1=i;  
           }
          if(s2==arr[i])
          {
            e2=i;
          }
        }
      System.out.println(e1);
      System.out.println(e2);
    }
}