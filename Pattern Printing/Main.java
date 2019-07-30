import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      int row = scan.nextInt();
      int column = scan.nextInt();
      for(int i = 1; i <= row; i++)
      {
         for(int j = column; j > column - i ; j--)
         {
            System.out.print(j);
         }
         for(int j = 1; j <= column - i; j++)
         {
            System.out.print(row - i + 1);
         }
         System.out.println();
      }
   }
}