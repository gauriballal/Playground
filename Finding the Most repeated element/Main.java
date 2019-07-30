import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
         arr[i] = scan.nextInt();
      }
      int frequency[] = new int[n];
	  System.out.println(mostFrequent(arr,n,frequency));
   }
   static int mostFrequent(int arr[], int n, int frequency[]) 
   { 
      int max_count_idx = 0; 
	  int curr_count = 1; 
	  for(int i = 0; i < n; i++)
	  {
         for (int j = i+1; j < n; j++) 
		 { 
	        if(arr[i] == arr[j])
	        curr_count ++;
		 }
		 frequency[i] = curr_count;
		 curr_count = 1;
	   } 
	   for( int i = 0; i < n; i++)
	   {
          if(frequency[i]>frequency[max_count_idx])
          max_count_idx = i;
	   }
	   return arr[max_count_idx];
	}
}