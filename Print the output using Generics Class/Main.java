import java.util.*;
public class Main<T> 
{ 
   private T t;
   public void insert(T t) 
   {
      this.t = t;
   }
   public T get() 
   {
      return t;
   }
   public static void main(String[] args) 
   { 
      Scanner scan = new Scanner(System.in);
      Main<Integer> in = new Main<Integer>();
      int num = scan.nextInt();
      in.insert(num);
      Main<String> str = new Main<String>();
      String str1 = scan.next();
      str.insert(str1);
      Main<Float>  fl = new Main<Float>();
      float f = scan.nextFloat();
      fl.insert(f);
      System.out.println("Integer Value: " + in.get());
      System.out.println("String Value: " + str.get());
      System.out.println("Float value: " + fl.get());   
   }
}