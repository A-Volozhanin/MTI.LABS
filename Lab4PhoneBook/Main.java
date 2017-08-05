package Lab4PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import Phonebook.Contact;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Integer count = 10000;
		ArrayList<PhoneBook> contactsList = new ArrayList<>(); // список
		HashSet<PhoneBook> contactsSet = new HashSet<>();
		HashMap<Integer, PhoneBook> contactsMap = new HashMap<>(); // карта		
		PhoneBook [] elements;
		
		
		
		for (Integer i=0; i<count; i++){
			contactsList.add(new PhoneBook());
		}
		
		System.out.println("итого найдено совпадений контактов в ArayList : " + compareList(contactsList));
		
		for (Integer i=0; i<count; i++){
			contactsSet.add(new PhoneBook());
		}
		
		System.out.println("итого найдено совпадений контактов в HashSet : " + compareSet(contactsSet));
		
		for (Integer i=0; i<count; i++){
			contactsMap.put(i, new PhoneBook());
		}
		
		System.out.println("итого найдено совпадений контактов в HashMap : " + compareMap(contactsMap));
		
		elements = new PhoneBook [count];
		for (Integer i=0; i<elements.length; i++){
			elements[i] = new PhoneBook();	
		}
		
		System.out.println("итого найдено совпадений контактов в Массиве : " + compareMas(elements));
		
				
	}
	private static Integer compareMas(PhoneBook[] elements) {
		long startTime = System.currentTimeMillis();
		Integer countcompare = 0;
		for (Integer i = elements.length -1; i >= 0 ; i--) {
			for (Integer j = 0; j < i; j++) {
	    	if (elements[i].phone2.contains(elements[j].phone2)){
	    		countcompare++;
	    		//System.out.println("у следующих пользователей Массива  одинаковые контакты: " + "\n");
	    		//elements[i].print();
	    		//elements[j].print();
	    		
	    		}
			}
			
			
		}
		long stopTime = System.currentTimeMillis();
		System.out.printf("Массив: %d ms\n", stopTime - startTime);
		
		return countcompare;
		
		
		
	}
	private static Integer compareMap(HashMap<Integer, PhoneBook> contactsMap) {
		long startTime = System.currentTimeMillis();
		Integer countcompare = 0;
		for (Integer i = contactsMap.size() -1; i >= 0 ; i--) {
		//for (Integer i = 0 ; i <contactsList.size(); i++) {
			//contactsList.get(i).print();
			for (Integer j = 0; j < i; j++) {
				//for (Integer j = i; i >= 0; i--) {
	    	if (contactsMap.get(i).phone2.contains(contactsMap.get(j).phone2)){
	    		countcompare++;
	    		//System.out.println("у следующих пользователей HashMap одинаковые контакты: " + "\n");
	    		//contactsMap.get(i).print();
	    		//contactsMap.get(j).print();
	    		
	    		}
			}
		}
		long stopTime = System.currentTimeMillis();
		System.out.printf("Map: %d ms\n", stopTime - startTime);
		return countcompare;
	}
	private static Integer compareList (ArrayList<PhoneBook> contactsList){
		long startTime = System.currentTimeMillis();
		Integer countcompare = 0;
		for (Integer i = contactsList.size() -1; i >= 0 ; i--) {
		//for (Integer i = 0 ; i <contactsList.size(); i++) {
			//contactsList.get(i).print();
			for (Integer j = 0; j < i; j++) {
				//for (Integer j = i; i >= 0; i--) {
	    	if (contactsList.get(i).phone2.contains(contactsList.get(j).phone2)){
	    		countcompare++;
	    		System.out.println("у следующих пользователей ArrayList одинаковые контакты: " + "\n");
	    		contactsList.get(i).print();
	    		contactsList.get(j).print();
	    		
	    		}
			}
		}
		long stopTime = System.currentTimeMillis();
		System.out.printf("Array: %d ms\n", stopTime - startTime);
		return countcompare;
	}
	
	private static Integer compareSet (HashSet<PhoneBook> contactsSet){
		long startTime = System.currentTimeMillis();
		Integer countcompare = 0;
	    for (Iterator<PhoneBook> it = contactsSet.iterator(); it.hasNext();) {
	    	
	    	PhoneBook i = it.next();
	    	PhoneBook k = it.next();
	    	//i.print();
	    	//k.print();
	    	if (i.phone2.contains(k.phone2)){
	        	countcompare++;
	        	//System.out.println("у следующих пользователей HashSet одинаковые контакты: " + "\n");
	        	//i.print();
	        	//k.print();       
	    	}
	    	
	}
	    long stopTime = System.currentTimeMillis();
	System.out.printf("Set: %d ms\n", stopTime - startTime);
		return countcompare;
	}
	private static void printmas(ArrayList<PhoneBook> contactsList) {
		for (int i=0; i < contactsList.size(); i++){
			contactsList.get(i).print();
	}
			
}

	
}