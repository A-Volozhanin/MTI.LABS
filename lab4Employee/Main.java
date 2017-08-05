package lab4Employee;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {

		Collection<Employee> employees = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			employees.add(new Employee("Имя: " + i, "Отчество: " + i, "Фамилия: " + i + " Стаж: ", i % 3 + 1));
		}		
		Employee.printEmployee(employees, 1);
		Employee.printEmployee(employees, 2);
		Employee.printEmployee(employees, 3);
	}

}
