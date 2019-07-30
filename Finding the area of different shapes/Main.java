import java.util.Scanner;
public class Main
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      int option = scan.nextInt();
      switch(option)
      {
         case 1:
            int side = scan.nextInt();
            int sqarea = side * side;
            System.out.println(sqarea);
            break;
         case 2:
            int l = scan.nextInt();
            int b = scan.nextInt();
            int rectarea = l * b;
            System.out.println(rectarea);
            break;
         case 3:
            int h = scan.nextInt();
            int base = scan.nextInt();
            int triarea = (h * base) / 2;
            System.out.println(triarea);
            break;
         case 4:
            int r = scan.nextInt();
            double cirarea = 3.14 * r * r;
            System.out.println(cirarea);
            break;
        }
   }
}