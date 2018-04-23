
import java.util.*;
public class KattisAaaah {

   public static void main(String [] args)
   {
   	Scanner scan = new Scanner(System.in);
   	String s1 = scan.nextLine();
   	String s2 = scan.nextLine();

   	if(s1.length() >= s2.length())
   	{
   		System.out.println("go");
   	}
   	else if(s1.length() < s2.length())
   	{
   		System.out.println("no");
   	}

   }


}