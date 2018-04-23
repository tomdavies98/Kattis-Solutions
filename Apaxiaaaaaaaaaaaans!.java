import java.util.*;
public class Apaxiaaaaaaaaaaaans! {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   String s1 = scan.nextLine().toLowerCase();
   String s2 = "";
   char a[] = new char[s1.length()];
   
   for(int i =0;i<s1.length();i++)
   {
     if(i != s1.length()-1)
      {
      if(s1.charAt(i) != s1.charAt(i+1))
      {
        s2 = s2 + s1.substring(i,i+1); 
         a[i] = s1.charAt(i);
      }
     }
     else if(i == s1.length()-1)
     {
       a[s1.length()-1] = s1.charAt(s1.length()-1);
               s2 = s2 + s1.substring(s1.length()-1, s1.length()); 

     }
   }
   
  /* for(int u =0; u<a.length; u++)
   {
     if(a[u] != ' ')
     {
      s2 += a[u];
     }
   }
    System.out.println(s2); */
        System.out.println(s2); 

    
  }
}