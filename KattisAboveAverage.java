import java.util.*;
import java.lang.Math.*;
public class KattisAboveAverage {

    public static void main(String [] args)
    {
    	Scanner scan = new Scanner(System.in);


    	int size = scan.nextInt();
   		int counter =0;
   		int average = 0;
   		int total = 0;
    	double percent = 0;
    	String ans = "";
    	String number = "";
    	String sub = "";
    	double ar[] = new double[size];

    	for(int i =0; i<size; i++)
    	{


    		int n = scan.nextInt();
    		int array[] = new int[n];
    		for(int j = 0; j<n; j++)
    		{
    			array[j] = scan.nextInt();
    			total += array[j];

    		}

			average = total/n;
			for(int h =0; h<n; h++)
			{
				if(array[h] > average)
				{
					counter++;

				}

			}
			percent = (100*((double)counter/(double)n));//df format is a string fix that
      percent = Math.round(percent*1000.0) / 1000.0;
      number = Double.toString(percent);

      for(int f = 0; f<number.length();f++)
      {
      if(number.charAt(f) == '.')
      {
        sub = number.substring(f+1);
        if(sub.length() == 1)
        {
          number = number + "00";
          break;
        }

        if(sub.length() == 2)
        {

          number = number + "0";
        }
       }
      }




			ans += (number+ "%\n");
			counter = 0;
			average = 0;
			total = 0;
			percent =0;


    	}

    	System.out.println(ans);


    }


}