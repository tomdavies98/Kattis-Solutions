import java.io.*;
import java.util.*;
class Main {
  public static void DeathKnightHero(String[] args){
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    boolean work = false;
    int count = 0;
    
    for(int i =0; i<size;i++)
    {
      work = false;
      String s1 = scan.next().toLowerCase();
      for(int j =0; j<s1.length();j++)
      {
        if(j != s1.length()-1)
        {
          if((s1.charAt(j) == 'c' && s1.charAt(j+1) == 'd' && work == false))
          {
            count = count+1;
            work = true;
          
          }
          
        }
        
      }
      
      
    }
    System.out.println(size-count);
    
    
  }
}