import java.util.Arrays;
import java.util.*;
public class Autori {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String x = scan.nextLine();
    
    for(int i =0; i<x.length();i++)
    {
      if(Character.isUpperCase(x.charAt(i)))
      {
        System.out.print(x.charAt(i));
      }
      
    }
  }
}