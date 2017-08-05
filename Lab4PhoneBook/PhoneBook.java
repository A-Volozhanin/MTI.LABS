package Lab4PhoneBook;

import java.util.Map;
import java.util.Random;




public class PhoneBook {

	String name;
	String phone1;
	String phone2;
	
	
	public PhoneBook() {
		this.name = "ФИО";
		this.phone1 = randomPhone();
		this.phone2 = randomPhone();
		
	}
		
	public static String randomPhone() {
		Random random = new Random();
		int length = 7;
		String characters = "0123456789";
		char[] text = new char[length];
		for (int i = 0; i < length; i++) {
			text[i] = characters.charAt(random.nextInt(characters.length()));
		}
		return "+7" + new String(text);
	}
	public void print(){
		System.out.println("ФИО: " + this.name + "\n" + "номер телефона: " + this.phone1 + "\n" + "номер контактного телефона " + this.phone2 + "\n--------------------");
		
	}	
	
}
