package Lab2;

import java.util.Scanner;

public class SetbyuserMatrix {

	public static float[][] main(String[] args) {
				
				        
		        float[][] mas2 = new float[row()][col()];
		 		        
		        for (int row = 0; row < mas2.length; row++) {
		            for (int col = 0; col < mas2[row].length; col++) {
		                mas2[row][col] = 2+row+col-2;
		                
		            }
	}
				return mas2;
		    
	}
	

		private static int row() {
        Scanner sc1 = new Scanner(System.in); // создаём объект класса Scanner
        System.out.print("Введите количество строк: ");
        int m = sc1.nextInt();
        
        return m;
        
	}
        private static int col() {
            Scanner sc2 = new Scanner(System.in); // создаём объект класса Scanner
            System.out.print("Введите количество столбцов: ");
            int n = sc2.nextInt();
                        
        return n;
        
 
	} 
    	
}
