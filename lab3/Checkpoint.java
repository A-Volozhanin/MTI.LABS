package lab3;

import java.util.Scanner;

public class Checkpoint {
	
	static Scanner in = null;
	
	static String name(){
		System.out.print("Введите марку автомобиля: ");
		String name = in.next();
		return name;
		
	}

	
	static int speed (){
		System.out.print("Введите скорость автомобиля: ");
		int speed = in.nextInt();
		return speed;
		
	}
	static int height (){
		System.out.print("Введите высоту автомобиля: ");
		int height = in.nextInt();
		return height;
		
	}
	static int weight (){
		System.out.print("Введите массу автомобиля: ");
		int weight = in.nextInt();
		return weight;
		
	}
	public static boolean goverment(){
		System.out.print("Автомобиль государственных служб? да(yes)/нет(no) ");
		String str = in.next();
		boolean goverment = false;
		if (str.contains("да")){
			goverment = true;
		}
		if (str.contains("нет")){
			goverment = false;
		}
		if (str.contains("yes")){
			goverment = true;
		}
		if (str.contains("no")){
			goverment = false;
		}
		
		return goverment;
	}
	
	public static boolean trailer(){
		boolean trailer = false;
		System.out.print("Наличие прицепа? да(yes)/нет(no) ");
		String str = in.next();
		if (str.contains("да")){
			trailer = true;
		}
		if (str.contains("нет")){
			trailer = false;
		}
		if (str.contains("yes")){
			trailer = true;
		}
		if (str.contains("no")){
			trailer = false;
		}
		
		return trailer;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		
		in = new Scanner(System.in);
		// автомобиль1
		System.out.println("---------------------------");
		System.out.println("Создание автомобиля № 1");
		System.out.println("---------------------------");		
		String car1brand = name();
		int car1speed = speed();
		int car1capacity = new Auto().getCapacitygenerator(); // методы с названием генератор подставляют рандомные числа 
		int car1height = new Auto().getHeightgenerator();
		int car1weight = new Auto().getWeightgenerator();
		boolean car1trailer = new Auto().getTrailerGenetrator();
		boolean car1auto = true;
		boolean car1goverment = goverment();
		
		
		System.out.println("---------------------------");
		System.out.println("Создание автомобиля № 2");
		System.out.println("---------------------------");	
		// автомобиль2  
        String car2brand = new Auto().getBrandgenerator();
        int car2speed = speed();
        int car2height = height();
        int car2weight = weight();
		int car2capacity = new Auto().getCapacitygenerator();
		boolean car2trailer = trailer();
		boolean car2goverment = goverment();
		boolean car2auto = false;
 	
		in.close();
	

		// автомобиль3
		String car3brand = new Auto().getBrandgenerator();
		int car3speed = new Auto().getSpeedgenerator();
		int car3capacity = new Auto().getCapacitygenerator();
		int car3height = new Auto().getHeightgenerator();
		int car3weight = new Auto().getWeightgenerator();
		boolean car3trailer = new Auto().getTrailerGenetrator();
		boolean car3goverment = new Auto().getGovermentGenetrator();
		boolean car3auto = false;
		
		System.out.println("---------------------------");
		
		
		
		infoauto(car1brand, car1speed, car1capacity, car1height, car1weight, car1goverment, car1auto);
		cp(car1brand, car1speed, car1height, car1weight, car1trailer, car1goverment, car1auto);
		
		infotrucks(car2brand, car2speed, car2capacity, car2height, car2weight, car2trailer, car2goverment, car2auto);
		cp(car2brand, car2speed, car2height, car2weight, car2trailer, car2goverment, car2auto);
		
		infotrucks(car3brand, car3speed, car3capacity, car3height, car3weight, car3trailer, car3goverment, car3auto);
		cp(car3brand, car3speed, car3height, car3weight, car3trailer, car3goverment, car3auto);
		
	}
	
	public static void infoauto(String carbrand,int carspeed, int carcapacity, int carheight, int carweight, boolean cargoverment, boolean carauto){
		System.out.println(" Марка автомобиля:  " + carbrand  +"\n Скорость автомобиля  " + carspeed +  "\n Грузоподъемность автомобиля:  " + carcapacity + "\n Высота автомобиля:  " +  carheight + "\n Вес автомобиля:  " + carweight+  "\n Является ли автомобилем государственных служб:  " + cargoverment + "\n Является ли автомобилем легковым:  " + carauto + "\n -------------------------------");
		
	}
	
	public static void infotrucks (String carbrand,int carspeed, int carcapacity, int carheight, int carweight, boolean trailer, boolean cargoverment, boolean carauto){
		System.out.println(" Марка автомобиля:  " + carbrand  +"\n Скорость автомобиля  " + carspeed +  "\n Грузоподъемность автомобиля:  " + carcapacity + "\n Высота автомобиля:  " +  carheight + "\n Вес автомобиля:  " + carweight+  "\n Наличие прицепа:  " + trailer + "\n Является ли автомобилем государственных служб:  " + cargoverment +  "\n Является ли автомобилем легковым:  " + carauto +  "\n -------------------------------");
		
	}
	
	public static void cp(String carbrand, int carspeed, int carheight, int carweight, boolean cartrailer, boolean cargoverment, boolean carauto) throws Exception{
		
		
		if (cargoverment){
			System.out.println("Автомобиль " + carbrand +" является автомобилем государственных служб и не подлежит проверке");
			return;
			
		}
		
		if (carauto){
			int cost = 1000;
			if (carspeed>80){
				cost+=500;
				if (carspeed>180){
					throw new Exception("Превышена максимально допустимая скорость, вызван патруль ДПС");	
			}
		
			}
			System.out.println("Стоимость проезда составила:  " + cost +"\n -------------------------------");
		}
	
		if (!carauto){
			int cost = 2000;
			
			if (carspeed>80){
				cost+=500;
				}
			if (carweight>10000){
				cost+=800;
				}
			
			if (cartrailer==true){
				cost+=500;
				}
			if (carspeed>180){
				throw new Exception("Превышена максимально допустимая скорость, вызван патруль ДПС");
			}
			if (carheight>4000){
				throw new Exception("Превышена максимальная высота ТС, проезд невозможен");
			}

			System.out.println("Стоимость проезда составила:  " + cost +"\n -------------------------------");
		

		}
		
		
		
		
	}	

		
		
		
	}
	
	


		
		
		

	
	
	
		
		

	


