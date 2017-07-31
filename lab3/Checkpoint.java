package lab3;

public class Checkpoint {
	
	public static void main(String[] args) throws Exception {

		// автомобиль1
		String car1brand = new Cars().getBrand();
		int car1speed = new Cars().getSpeedgenerator();
		int car1capacity = new Cars().getCapacitygenerator(); // методы с названием генератор подставляют рандомные числа 
		int car1height = new Cars().getHeightgenerator();
		int car1weight = new Cars().getWeightgenerator();
		boolean car1trailer = new Cars().getTrailer();
		boolean car1goverment = new Cars().getGoverment();
		boolean car1auto = new Cars().getauto();

		// автомобиль2
		String car2brand = new Trucks().getBrand();
		int car2speed = new Trucks().getSpeed();
		int car2capacity = new Trucks().getCapacity();
		int car2height = new Trucks().getHeight();
		int car2weight = new Trucks().getWeight();
		boolean car2trailer = new Trucks().getTrailer();
		boolean car2goverment = new Trucks().getGoverment();
		boolean car2trucks = new Trucks().getauto();

		// автомобиль3
		String car3brand = new Trucks().getBrand();
		int car3speed = new Trucks().getSpeedgenerator();
		int car3capacity = new Trucks().getCapacitygenerator();
		int car3height = new Trucks().getHeightgenerator();
		int car3weight = new Trucks().getWeightgenerator();
		boolean car3trailer = new Trucks().getTrailer();
		boolean car3goverment = new Trucks().getGoverment();
		boolean car3trucks = new Trucks().getauto();
		
		
		infoauto(car1brand, car1speed, car1capacity, car1height, car1weight, car1goverment, car1auto);
		cp(car1brand, car1speed, car1height, car1weight, car1trailer, car1goverment, car1auto);
		
		infotrucks(car2brand, car2speed, car2capacity, car2height, car2weight, car2trailer, car2goverment, car2trucks);
		cp(car2brand, car2speed, car2height, car2weight, car2trailer, car2goverment, car2trucks);
		
		infotrucks(car3brand, car3speed, car3capacity, car3height, car3weight, car3trailer, car3goverment, car3trucks);
		cp(car3brand, car3speed, car3height, car3weight, car3trailer, car3goverment, car3trucks);
		
	}
	
	public static void infoauto(String carbrand,int carspeed, int carcapacity, int carheight, int carweight, boolean cargoverment, boolean carauto){
		System.out.println(" Марка автомобиля:  " + carbrand  +"\n Скорость автомобиля  " + carspeed +  "\n Грузоподъемность автомобиля:  " + carcapacity + "\n Высота автомобиля:  " +  carheight + "\n Вес автомобиля:  " + carweight+  "\n Является ли автомобилем государственных служб:  " + cargoverment + "\n Является ли автомобилем легковым:  " + carauto + "\n -------------------------------");
		
	}
	
	public static void infotrucks (String carbrand,int carspeed, int carcapacity, int carheight, int carweight, boolean trailer, boolean cargoverment, boolean carauto){
		System.out.println(" Марка автомобиля:  " + carbrand  +"\n Скорость автомобиля  " + carspeed +  "\n Грузоподъемность автомобиля:  " + carcapacity + "\n Высота автомобиля:  " +  carheight + "\n Вес автомобиля:  " + carweight+  "\n Наличие прицепа:  " + trailer + "\n Является ли автомобилем государственных служб:  " + cargoverment +  "\n Является ли автомобилем легковым:  " + carauto +  "\n -------------------------------");
		
	}
	
	public static void cp(String carbrand, int carspeed, int carheight, int carweight, boolean cartrailer, boolean cargoverment, boolean carauto) throws Exception{
		
		
		if (cargoverment == true){
			System.out.println("Автомобиль " + carbrand +" является автомобилем государственных служб и не подлежит проверке");
			return;
			
		}
		
		if (carauto == true){
			int cost = 1000;
			if (carspeed>80){
				cost+=500;
				if (carspeed>180){
					throw new Exception("Превышена максимально допустимая скорость, вызван патруль ДПС");	
			}
		
			}
			System.out.println("Стоимость проезда составила:  " + cost +"\n -------------------------------");
		}
	
		if (carauto == false){
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
		
		
		

	
	
	
		
		

	


