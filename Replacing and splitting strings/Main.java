import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      String str1 = scan.nextLine();
      String str2 = scan.nextLine();
      int no_of_parts = scan.nextInt();
      String str3 = str1.replace(str1, str2);
      String flag[] = str3.split(" ",no_of_parts);
      for(String res: flag)
      System.out.println(res);
   }
}