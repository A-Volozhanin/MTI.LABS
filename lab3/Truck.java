package lab3;
import java.util.Scanner;
import java.util.Random;
	
	public class Truck {
		int speed;
		int capacity;
		int height;
		int weight;
		String brand;
		boolean trailer;
		boolean goverment;
		boolean trucks;
		
		public int getSpeed(){
			Scanner sc1 = new Scanner(System.in); // создаём объект класса Scanner
	        System.out.print("Введите скорость автомобиля : ");
	        int speed = sc1.nextInt();
			return speed;
		}
		public int getSpeedgenerator(){
			final Random random = new Random();
			int speed = random.nextInt(200);
			return speed;
		}
			public int getCapacity(){
			Scanner sc2 = new Scanner(System.in); // создаём объект класса Scanner
		    System.out.print("Введите грузоподъемность автомобиля : ");
		    int capacity = sc2.nextInt();   
			return capacity;
		}
			
			public int getCapacitygenerator(){
				final Random random = new Random();
				int capacity = random.nextInt(3000);
				return capacity;
			}
			public int getHeight(){
			Scanner sc3 = new Scanner(System.in); // создаём объект класса Scanner
			System.out.print("Введите высоту автомобиля автомобиля : ");
			int height = sc3.nextInt();
			return height;
		}
			public int getHeightgenerator(){
				final Random random = new Random();
				int height = random.nextInt(5000);
				return height;
			}
			public int getWeight(){
			Scanner sc4 = new Scanner(System.in); // создаём объект класса Scanner
			System.out.print("Введите массу автомобиля автомобиля : ");
			int weight = sc4.nextInt();	
			return weight;
		}
			public int getWeightgenerator(){
				final Random random = new Random();
				int weight = random.nextInt(12000);
				return weight;
			}
			public String getBrand(){
				Scanner sc5 = new Scanner(System.in); // создаём объект класса Scanner
				System.out.print("Введите марку автомобиля : ");
				String brand = sc5.nextLine();
				return brand;
		}
			public String getBrandgenerator(){
				final Random random = new Random();
				String brand = random.toString();
				return brand;
			}
			public boolean getTrailer(){
				boolean trailer = false;
				Scanner sc6 = new Scanner(System.in); // создаём объект класса Scanner
				System.out.print("Наличие прицепа? да(yes)/нет(no) ");
				String str = sc6.nextLine();
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
			public boolean getTrailerGenetrator(){
				final Random random = new Random();
				boolean trailer = random.nextBoolean();
				
				return trailer;
			}
			
			public boolean getGoverment(){
				boolean goverment = false;
				Scanner sc7 = new Scanner(System.in); // создаём объект класса Scanner
				System.out.print("Автомобиль государственных служб? да(yes)/нет(no) ");
				String str = sc7.nextLine();
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
			
			public boolean getGovermentGenetrator(){
				final Random random = new Random();
				boolean goverment = random.nextBoolean();
				
				return goverment;
			}
			public boolean getauto(){
				boolean auto = false;
				return auto;
			}
	}

