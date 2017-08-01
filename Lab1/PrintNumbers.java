package Lab1;
public class PrintNumbers {

	public static void main(String[] args) {
	       int number;
	       int j;
	        for (number = 1; number < 1000; number++)
	        {
	            j = 0;
	            for (int i = 1; i <= number; i++)
	            {
	                if (number % i == 0)
	                    j++;	                
	            }
	            if (j <= 2)
	                System.out.println(number);
	        }
	        
	}
	
}
