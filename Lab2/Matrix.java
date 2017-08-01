package Lab2;

public class Matrix {
	
	float n;
	float m;
	// первая матрица
	public float[][] gen(int n, int m){
	float[][] mas = new float[m][n];
    for (int row = 0; row < mas.length; row++) {
        for (int col = 0; col < mas[row].length; col++) {
            mas[row][col] = 1;
        }
			
    }
	return mas;
	}
	// вторая матрица
	public float[][] gen2(int n, int m){
	float[][] mas = new float[m][n];
    for (int row = 0; row < mas.length; row++) {
        for (int col = 0; col < mas[row].length; col++) {
            mas[row][col] = 4;
        }
			
    }
	return mas;
    }
	
	
		public static void summ(float [][]x, float [][]x2) {		
	 	System.out.println("суммирование");
		float[][] newmas = new float[3][3];
        for (int row = 0; row < newmas.length; row++) {
            for (int col = 0; col < newmas[row].length; col++) {
                newmas[row][col] = x[row][col]+x2[row][col];
                System.out.print(newmas[row][col]+" ");}
            
            System.out.println("");}
        System.out.println("--------");
                
		}
	 	
	 	public static void substraction (float [][]x, float [][]x2) {
	 	System.out.println("Вычитание");
        float[][] newmas2 = new float[3][3];
        for (int row = 0; row < newmas2.length; row++) {
        	for (int col = 0; col < newmas2[row].length; col++) {
        		newmas2[row][col] = x[row][col]-x2[row][col];
        		System.out.print(newmas2[row][col]+" ");}
        	
        	System.out.println("");}
        System.out.println("--------");
                 
	 	}
	 	
	 	public static void multiplication (float [][]x, int m) {
	 		System.out.println("умножение");
	 		float[][] newmas3 = new float[3][3];
	 		for (int row = 0; row < newmas3.length; row++) {
	 			for (int col = 0; col < newmas3[row].length; col++) {
	 				newmas3[row][col] = x[row][col]*m;
	 				System.out.print(newmas3[row][col]+" ");}

	 			System.out.println("");}
	 		System.out.println("--------");	 		      

	 	}
	 	
	 
	 	public static void unit (float [][]x){
	 		System.out.println("Единичная матрица");
	 		float[][] newmas3 = new float[3][3];
	 		for (int row = 0; row < newmas3.length; row++) {
	 			for (int col = 0; col < newmas3[row].length; col++) {
	 				newmas3[row][col] = 0;
	 				if (row==col){
	 					newmas3[row][col] = 1;
	 					
	 				}
	 				System.out.print(newmas3[row][col]);}

	 			System.out.println("");}
	 		       
	 		System.out.println("--------");	 	
	 		
	 	}
	 	public static void size (float [][]x, float [][]x2){
	 		int row = 0;
	 		System.out.println("Размерность матрицы");
	 		System.out.println("Размер первой матрицы:  строки:  " + x.length +"  стобцы:  "+ x[row].length);
	 		System.out.println("Размер второй матрицы:  строки:  " + x2.length +"  стобцы:  "+ x2[row].length);
	 		System.out.println("--------");
	 		
	 	}
	 		
	 	public static void printformatter(float[][] x7) {
	 		int row=0;
	 		StringBuilder sb = new StringBuilder();
	 		sb.append(String.format("Печать с использованием форматтера, матрица №: %s \nМатрица %dx%d", x7.hashCode(), x7.length , x7[row].length));
	 		//System.out.println("--------");
	 		System.out.println(sb);
			for (int row1 =0; row1<x7.length; row1++) {
				for (int col=0; col<x7[row1].length; col++){
					System.out.print(x7[row1][col]+" ");}
	            
	            System.out.println("");
		 					 					 					
	 				}
			System.out.println("--------");
	 				
	 			}
		public static float det(float[][] x) { // вычисляем детерминант
			
			float det = x[0][0]*x[1][1]*x[2][2]-x[0][0]*x[1][2]*x[2][1]-x[0][1]*x[1][0]*x[2][2]+x[0][1]*x[1][2]*x[2][0]+x[0][2]*x[1][0]*x[2][1]-x[0][2]*x[1][1]*x[2][0];
			
			return det;
	 			 		
}
		public static void matrixmultiplication (float[][] x, float[][] x2) {
	 		System.out.println("умножение матриц");
	 		float[][] newmas3 = new float[3][3];
	 		
	 				newmas3[0][0] = x[0][0]*x2[0][0]+x[0][1]*x2[1][0]+x[0][2]*x2[2][0];
	 				newmas3[0][1] = x[0][0]*x2[0][1]+x[0][1]*x2[1][1]+x[0][2]*x2[2][1];
	 				newmas3[0][2] = x[0][0]*x2[0][2]+x[0][1]*x2[1][2]+x[0][2]*x2[2][2];
	 				newmas3[1][0] = x[1][0]*x2[0][0]+x[1][1]*x2[1][0]+x[1][2]*x2[2][0];
	 				newmas3[1][1] = x[1][0]*x2[0][1]+x[1][1]*x2[1][1]+x[1][2]*x2[2][1];
	 				newmas3[1][2] = x[1][0]*x2[0][2]+x[1][1]*x2[1][2]+x[1][2]*x2[2][2];
	 				newmas3[2][0] = x[2][0]*x2[0][0]+x[2][1]*x2[1][0]+x[2][2]*x2[2][0];
	 				newmas3[2][1] = x[2][0]*x2[0][1]+x[2][1]*x2[1][1]+x[2][2]*x2[2][1];
	 				newmas3[2][2] = x[2][0]*x2[0][2]+x[2][1]*x2[1][2]+x[2][2]*x2[2][2];
	 				for (int row1 =0; row1<newmas3.length; row1++) {
	 					for (int col=0; col<newmas3[row1].length; col++){
	 						System.out.print(newmas3[row1][col]+" ");}
	 								

	 			System.out.println("");}
	 		System.out.println("--------");	
			    }
		public static void inversion (float[][] x) {
			if (Matrix.det(x)==0.0){
				System.out.println("Матрица вырожденная, нет обратной матрицы");
				System.out.println("--------");
				return;
			}
			
			float [][] M = Matrix.transportMatrix(x);
			float[][] NM = new float[3][3];
			Matrix.printformatter(Matrix.transportMatrix(x));
			
			NM[0][0]=((M[1][1]*M[2][2]-M[2][1]*M[1][2])*(+1))/Matrix.det(x);
			NM[0][1] = ((M[1][0]*M[2][2]-M[2][0]*M[1][2])*(-1))/Matrix.det(x); 
			NM[0][2] = ((M[1][0]*M[2][1]-M[1][1]*M[2][0])*(+1))/Matrix.det(x); 
			NM[1][0] = ((M[0][1]*M[2][2]-M[0][2]*M[2][1])*(-1))/Matrix.det(x);		
			NM[1][1] = ((M[0][0]*M[2][2]-M[0][2]*M[2][0])*(+1))/Matrix.det(x); 
			NM[1][2] = ((M[0][0]*M[2][1]-M[2][0]*M[0][1])*(-1))/Matrix.det(x); 
			NM[2][0] = ((M[0][1]*M[1][2]-M[0][2]*M[1][1])*(+1))/Matrix.det(x);
			NM[2][1] = ((M[0][0]*M[1][2]-M[1][0]*M[0][2])*(-1))/Matrix.det(x); 
			NM[2][2] = ((M[0][0]*M[1][1]-M[1][0]*M[0][1])*(+1))/Matrix.det(x);
			
			Matrix.printformatter(NM);
							
						
		}
		public static float[][] transportMatrix(float[][] x) {
		    float[][] b = new float[x.length][x.length];
		    for (int i = 0; i < x.length; ++i)
		        for (int j = 0; j < x.length; ++j) {
		             b[i][j] = x[j][i];
		             
		        }
		    return b;
		}


}
