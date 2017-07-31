package Lab2;

public class DefaultMatrix {

	public static float[][] main(String[] args) {
		
		int m=3;
		int n=3;
        float[][] mas = new float[m][n];
        for (int row = 0; row < mas.length; row++) {
            for (int col = 0; col < mas[row].length; col++) {
                mas[row][col] = 1;
            }

	}
		return mas;
	}
}

