package Lab2;

public class Main {

	public static void main(String[] args) {
			
		Matrix.summ(new Matrix().gen(3, 3), new Matrix().gen2(3, 3));
		Matrix.substraction(new Matrix().gen2(3, 3), new Matrix().gen(3, 3));
		System.out.println("Детерминант равнен: " +Matrix.det(new Matrix().gen(3, 3))+ "\n--------");
		Matrix.multiplication(new Matrix().gen2(3, 3), 4);
		Matrix.matrixmultiplication(new Matrix().gen(3, 3), new Matrix().gen2(3, 3));
		Matrix.printformatter(new Matrix().gen2(3, 3));
		Matrix.size(new Matrix().gen(3, 3), new Matrix().gen2(3, 3));
		Matrix.inversion(new Matrix().gen(3, 3));
		Matrix.unit(new Matrix().gen2(3, 3));	
		
		}

}
