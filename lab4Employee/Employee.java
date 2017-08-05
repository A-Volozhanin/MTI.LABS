package lab4Employee;

import java.util.Collection;
import java.util.Iterator;

public class Employee {
	String firstName; 
	String middleName;
	String lastName; 
	int workAge; 

	public Employee(String firstName, String middleName, String lastName, int workAge) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.workAge = workAge;
	}

	public static void printEmployee(Collection<Employee> employees, int workAge) {
		Iterator<Employee> it = employees.iterator();
		System.out.println("Работники со стажем " + workAge);
		while (it.hasNext()) {
			Employee e = it.next();
			if (e.workAge == workAge) {
				System.out.println(e.firstName + " " + e.middleName + " " + e.lastName + " " + e.workAge + " ");
			}
		}
		System.out.println();
	}

}
