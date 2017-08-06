package lab5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Main 
	{
	
	public static void main(String[] args) throws Exception {	
		
		Class<?> matrix1 = Class.forName(Matrix.class.getName());
		Constructor<?> defCons = matrix1.getConstructor();
		Constructor<?> overCons = matrix1.getConstructor(int.class, int.class);
		
		Matrix defMatrix = (Matrix) defCons.newInstance();
		Matrix overMatrix = (Matrix) overCons.newInstance(3, 3);
		
		Method print = matrix1.getDeclaredMethod("printformatter");
		
		defMatrix.gen(3);
		overMatrix.gen(1);
		
		System.out.println("Первоначальные матрицы");
		System.out.println("----------------------");
		System.out.println("Конструктор по умолчанию");
		System.out.println("");
		print.invoke(defMatrix);
		System.out.println("Перегруженный констуктор");
		System.out.println("");
		print.invoke(overMatrix);		
		
		Method[] methods = matrix1.getDeclaredMethods();
		Field[] fields = matrix1.getDeclaredFields();
		
		System.out.println("Методы класса");
		System.out.println("");
		for (Method m : methods) {
			System.out.println("метод " + m.toGenericString());
		}
		System.out.println("----------------------");
		System.out.println("Поля класса");
		System.out.println("");
		for (Field f : fields) {
			System.out.println("поле " + f.toGenericString());
		}
		
		System.out.println("----------------------");
		Method summ = matrix1.getDeclaredMethod("summ", Matrix.class);
		summ.invoke(defMatrix, overMatrix);
		Method substraction = matrix1.getDeclaredMethod("substraction", Matrix.class);
		substraction.invoke(defMatrix, overMatrix);
		
		System.out.println("Печать с использованием приватного метода");
		System.out.println("");
		print.invoke(overMatrix);
	}

}