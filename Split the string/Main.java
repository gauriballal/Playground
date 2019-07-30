import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       Pattern pattern = Pattern.compile("(,| |and|or)");
       String[] part = pattern.split(str);
       for(String p:part)
       {
          System.out.println(p);
       }   
    }
}