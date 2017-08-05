package lab4Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
	static HashSet <Integer> set1;
	static HashSet <Integer> set2;
	

	public static void main(String[] args) {
		Random random = new Random();

		set1= new HashSet<>();
		set2 = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			set1.add(random.nextInt(99));
			set2.add(random.nextInt(99));
		}

		System.out.println("set1:" + "\n" + set1);
		System.out.println("set2:" + "\n" + set1);
		System.out.println("Пересечение" + "\n" + intersect(set1, set2));
		System.out.println("Объединение" + "\n" + union(set1, set2));

	}

	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<>(set1);
		result.retainAll(set2);

		return result;
	}

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<>(set1);
		result.addAll(set2);

		return result;
	}

}