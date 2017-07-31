package Lab1;
import java.util.Scanner;
 
public class Volozhanin_quadr {
 
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.print("Введите c: ");
        int c = in.nextInt();
        System.out.println("a:"+a+"		b:"+b+"		c:"+c);
        
        while (a==0) {
        	System.out.print("Первый коэффициент не может быть 0\n");
        	System.out.print("Введите a: ");
            a = in.nextInt();      	      	      	
        }
        
        float d = b * b - 4 * a * c;
        
        System.out.println("Дискриминант равен "+d);
        
        if (d < 0) { 
			System.out.println("Нет действительных решений уравнения");
		} else if (d > 0) { 
			double x1 = (-b - Math.sqrt(d)) / (2 * a);
			double x2 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.printf("Корни уравнения: x1 = " +x1 + " x2 = " +x2);
			
		} else { 
			double x = -b / (2 * a);
			System.out.printf("Корень уровнения: x = " + x);
		}
        
        in.close();
                                            
    }   
} 


