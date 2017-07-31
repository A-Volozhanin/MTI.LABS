package Lab1;
import java.util.Scanner;

public class qudrplus {
	
	public static int getSquareRoot(int number) {
		for (int i = number; i > 0; i--) {
			System.out.println(i);		
			if (i * i == number) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        while (a<0) {
        	System.out.print("Введенное число не может быть меньше 0\n");
        	System.out.print("Введите число: ");
            a = in.nextInt();      	      	      	
        }

	int root = getSquareRoot(a); 

		if (root > 0) { // выводим ответ.
			System.out.printf("Корень числа %d = %d\n", a, root);
		} else {
			System.out.printf("У числа %d нет целочисленного квадратного корня.\n", a);
		}
	}
	
}
    	// Вычисляем квадратные корни введенных чисел.
    	
		

