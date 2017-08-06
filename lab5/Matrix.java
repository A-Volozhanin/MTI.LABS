package lab5;

public class Matrix {
	
	int n;
	int m;
	float[][] elements;
	
	public Matrix() { 
		n = 3;
		m = 3; 
		elements = new float[n][m];
	}
	
	public Matrix(int n, int m) { // вспомогательный конструктор
		this.n = n; // задаем размер матрицы
		this.m = m;
		this.elements = new float[n][m];
	}

	
	

	public float[][] gen(int i){
	this.elements = new float[m][n];
    for (int row = 0; row < this.elements.length; row++) {
        for (int col = 0; col < this.elements[row].length; col++) {
            this.elements[row][col] = i;
        }
			
    }
	return this.elements;
	}
	public Matrix summ(Matrix anotherMatrix) throws Exception {	
		System.out.println("суммирование"); 
		Matrix result = new Matrix();
		for (int row = 0; row < this.elements.length; row++) { 
		for (int col = 0; col < this.elements[row].length; col++) { 
		result.elements[row][col] = this.elements[row][col]+anotherMatrix.elements[row][col]; 
		System.out.print(result.elements[row][col] +" "); 
		}	
		System.out.println(""); 
		} 
		System.out.println("--------"); 
		
		return result; 
		} 	
	 	
	 	public Matrix substraction (Matrix anotherMatrix) throws Exception {
	 	System.out.println("Вычитание");
	 	Matrix result = new Matrix();
        for (int row = 0; row < this.elements.length; row++) {
        	for (int col = 0; col < this.elements[row].length; col++) {
        		result.elements[row][col] = this.elements[row][col]-anotherMatrix.elements[row][col];
        		System.out.print(result.elements[row][col]+" ");}
        	
        	System.out.println("");}
        System.out.println("--------");
		
        return result;
                 
	 	}
	 	
	 	public Matrix multiplication (int m) {
	 		System.out.println("умножение");
	 		Matrix result = new Matrix();
	 		for (int row = 0; row < this.elements.length; row++) {
	 			for (int col = 0; col < this.elements[row].length; col++) {
	 				result.elements[row][col] = this.elements[row][col]*m;
	 				System.out.print(result.elements[row][col]+" ");}

	 			System.out.println("");}
	 		System.out.println("--------");
			return result;	 		      

	 	}
	 	
	 	public Matrix unit (Matrix anotherMatrix){
	 		System.out.println("Единичная матрица");
	 		Matrix result = new Matrix();
	 		for (int row = 0; row < this.elements.length; row++) {
	 			for (int col = 0; col < this.elements[row].length; col++) {
	 				result.elements[row][col] = 0;
	 				if (row==col){
	 					result.elements[row][col] = 1;
	 					
	 				}
	 				System.out.print(result.elements[row][col]);}

	 			System.out.println("");}
	 		       
	 		System.out.println("--------");
			return result;	 	
	 		
	 	}
	 	public Matrix size (Matrix anotherMatrix){
	 		int row = 0;
	 		System.out.println("Размерность матрицы");
	 		System.out.println("Размер первой матрицы:  строки:  " + this.elements.length +"  стобцы:  "+ this.elements[row].length);
	 		System.out.println("Размер второй матрицы:  строки:  " + anotherMatrix.elements.length +"  стобцы:  "+ anotherMatrix.elements[row].length);
	 		System.out.println("--------");
			return anotherMatrix;
	 		
	 	}
	 		
	 	public Matrix printformatter() {
	 		int row=0;
	 		StringBuilder sb = new StringBuilder();
	 		sb.append(String.format("Печать с использованием форматтера, матрица №: %s \nМатрица %dx%d", this.elements.hashCode(), this.elements.length , this.elements[row].length));
	 		//System.out.println("--------");
	 		System.out.println(sb);
			for (int row1 =0; row1<this.elements.length; row1++) {
				for (int col=0; col<this.elements[row1].length; col++){
					System.out.print(this.elements[row1][col]+" ");}
	            
	            System.out.println("");
		 					 					 					
	 				}
			System.out.println("--------");
			return null;
	 				
	 			}
		public float det() { // вычисляем детерминант
			
			float det = this.elements[0][0]*this.elements[1][1]*this.elements[2][2]-this.elements[0][0]*this.elements[1][2]*this.elements[2][1]-this.elements[0][1]*this.elements[1][0]*this.elements[2][2]+this.elements[0][1]*this.elements[1][2]*this.elements[2][0]+this.elements[0][2]*this.elements[1][0]*this.elements[2][1]-this.elements[0][2]*this.elements[1][1]*this.elements[2][0];
			
			System.out.print("детерминант равен: " + det);
			System.out.println("");
			System.out.println("--------");
			return det;
	 			 		
}
		public Matrix matrixmultiplication (Matrix anotherMatrix) {
	 		System.out.println("умножение матриц");
	 		Matrix result = new Matrix();
	 		
	 				result.elements[0][0] = this.elements[0][0]*anotherMatrix.elements[0][0]+this.elements[0][1]*anotherMatrix.elements[1][0]+this.elements[0][2]*anotherMatrix.elements[2][0];
	 				result.elements[0][1] = this.elements[0][0]*anotherMatrix.elements[0][1]+this.elements[0][1]*anotherMatrix.elements[1][1]+this.elements[0][2]*anotherMatrix.elements[2][1];
	 				result.elements[0][2] = this.elements[0][0]*anotherMatrix.elements[0][2]+this.elements[0][1]*anotherMatrix.elements[1][2]+this.elements[0][2]*anotherMatrix.elements[2][2];
	 				result.elements[1][0] = this.elements[1][0]*anotherMatrix.elements[0][0]+this.elements[1][1]*anotherMatrix.elements[1][0]+this.elements[1][2]*anotherMatrix.elements[2][0];
	 				result.elements[1][1] = this.elements[1][0]*anotherMatrix.elements[0][1]+this.elements[1][1]*anotherMatrix.elements[1][1]+this.elements[1][2]*anotherMatrix.elements[2][1];
	 				result.elements[1][2] = this.elements[1][0]*anotherMatrix.elements[0][2]+this.elements[1][1]*anotherMatrix.elements[1][2]+this.elements[1][2]*anotherMatrix.elements[2][2];
	 				result.elements[2][0] = this.elements[2][0]*anotherMatrix.elements[0][0]+this.elements[2][1]*anotherMatrix.elements[1][0]+this.elements[2][2]*anotherMatrix.elements[2][0];
	 				result.elements[2][1] = this.elements[2][0]*anotherMatrix.elements[0][1]+this.elements[2][1]*anotherMatrix.elements[1][1]+this.elements[2][2]*anotherMatrix.elements[2][1];
	 				result.elements[2][2] = this.elements[2][0]*anotherMatrix.elements[0][2]+this.elements[2][1]*anotherMatrix.elements[1][2]+this.elements[2][2]*anotherMatrix.elements[2][2];
	 				for (int row1 =0; row1<result.elements.length; row1++) {
	 					for (int col=0; col<result.elements[row1].length; col++){
	 						System.out.print(result.elements[row1][col]+" ");}
	 								

	 			System.out.println("");}
	 		System.out.println("--------");
			return result;	
			    }
		@SuppressWarnings("null")
		public float[][] inversion () {
			float[][] M = null;
			float det = this.elements[0][0]*this.elements[1][1]*this.elements[2][2]-this.elements[0][0]*this.elements[1][2]*this.elements[2][1]-this.elements[0][1]*this.elements[1][0]*this.elements[2][2]+this.elements[0][1]*this.elements[1][2]*this.elements[2][0]+this.elements[0][2]*this.elements[1][0]*this.elements[2][1]-this.elements[0][2]*this.elements[1][1]*this.elements[2][0];
			
			if (det==0.0){
				System.out.println("Матрица вырожденная, нет обратной матрицы");
				System.out.println("--------");
				return null;
			}
			
		    for (int i = 0; i < this.elements.length; ++i)
		        for (int j = 0; j < this.elements.length; ++j) {
		             
					M[i][j] = this.elements[j][i];
		        
		        }
			float[][] NM = new float[3][3];
			
			
			NM[0][0]=((M[1][1]*M[2][2]-M[2][1]*M[1][2])*(+1))/det;
			NM[0][1] = ((M[1][0]*M[2][2]-M[2][0]*M[1][2])*(-1))/det; 
			NM[0][2] = ((M[1][0]*M[2][1]-M[1][1]*M[2][0])*(+1))/det; 
			NM[1][0] = ((M[0][1]*M[2][2]-M[0][2]*M[2][1])*(-1))/det;		
			NM[1][1] = ((M[0][0]*M[2][2]-M[0][2]*M[2][0])*(+1))/det; 
			NM[1][2] = ((M[0][0]*M[2][1]-M[2][0]*M[0][1])*(-1))/det; 
			NM[2][0] = ((M[0][1]*M[1][2]-M[0][2]*M[1][1])*(+1))/det;
			NM[2][1] = ((M[0][0]*M[1][2]-M[1][0]*M[0][2])*(-1))/det; 
			NM[2][2] = ((M[0][0]*M[1][1]-M[1][0]*M[0][1])*(+1))/det;
			
			Matrix.printformatter(NM);
			
			return NM;
			
			
							
						
		}
		private static void printformatter(float[][] x) {
	 		int row=0;
	 		StringBuilder sb = new StringBuilder();
	 		sb.append(String.format("Печать с использованием форматтера, матрица №: %s \nМатрица %dx%d", x.hashCode(), x.length , x[row].length));
	 		//System.out.println("--------");
	 		System.out.println(sb);
			for (int row1 =0; row1<x.length; row1++) {
				for (int col=0; col<x[row1].length; col++){
					System.out.print(x[row1][col]+" ");}
	            
	            System.out.println("");
		 					 					 					
	 				}
			System.out.println("--------");
			
			
		}


		public float[][] transportMatrix() {
		    float[][] b = new float[this.elements.length][this.elements.length];
		    for (int i = 0; i < this.elements.length; ++i)
		        for (int j = 0; j < this.elements.length; ++j) {
		             b[i][j] = this.elements[j][i];
		             
		        }
		    return b;
		}


}
