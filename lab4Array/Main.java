package lab4Array;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Main {
	static List<Integer> list;

	public static void main(String[] args) {
		list = new ArrayList<>();
				Random random = new Random();

		for (int i = 0; i < 70; i++) {
			list.add(random.nextInt(100));
		}
		
		System.out.println("Исходный список: " + "\n"  + list);
		
		ListIterator<Integer> it = list.listIterator(list.size());
		
		while(it.hasPrevious()) {
			it.previous();
			if (it.previousIndex() % 2 != 0) {
				it.remove();
			}
		}
		
		System.out.println("Список после удаления нечетных индексов: " +"\n" + list);

	}
}