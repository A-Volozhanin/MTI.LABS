package lab3;

import java.util.Random;

public class Auto {
	
	public String getBrandgenerator(){
		final Random random = new Random();
		String brand = random.toString();
		return brand;
	}
	public int getSpeedgenerator(){
		final Random random = new Random();
		int speed = random.nextInt(200);
		return speed;
	}
	public int getCapacitygenerator(){
		final Random random = new Random();
		int capacity = random.nextInt(3000);
		return capacity;
	}
	
	public int getHeightgenerator(){
		final Random random = new Random();
		int height = random.nextInt(3000);
		return height;
	}
	public int getWeightgenerator(){
		final Random random = new Random();
		int weight = random.nextInt(3000);
		return weight;
	}
	
	public boolean getTrailerGenetrator(){
		final Random random = new Random();
		boolean trailer = random.nextBoolean();
		
		return trailer;
	}
	
	public boolean getGovermentGenetrator(){
		final Random random = new Random();
		boolean goverment = random.nextBoolean();
		
		return goverment;
	}
}
