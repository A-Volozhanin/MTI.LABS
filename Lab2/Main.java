package Lab2;

public class Main 
	{


	public static void main(String[] args) {
		
		Matrix x = new Matrix();
		x.gen();
		Matrix anotherMatrix = new Matrix();
		anotherMatrix.gen();
		x.summ(anotherMatrix);
		x.substraction(anotherMatrix);
		x.multiplication(9);
		x.unit(anotherMatrix);
		x.size(anotherMatrix);
		x.printformatter();
		x.det();
		x.matrixmultiplication(anotherMatrix);
		x.inversion();
		
		
		
		

	}

}