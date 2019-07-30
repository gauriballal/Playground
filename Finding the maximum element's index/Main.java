import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner in = new Scanner(System.in);
     int size = in.nextInt();
     int arr[]=new int[size];
     for(int i=0;i<=size-1;i++)
     {
        arr[i]=in.nextInt();  
     }
    int maxno;
    int e1=-1;
    if(arr[0]>arr[1])
    {
       maxno=arr[0];
       e1=0;
    }
    else
    {
       maxno=arr[1];
       e1=1;
    }
    for(int i=2;i<=size-1;i++)
    {
      if(maxno<arr[i])
      {
         maxno=arr[i];
         e1=i;
      }
    }
    System.out.println(e1);
  }
}