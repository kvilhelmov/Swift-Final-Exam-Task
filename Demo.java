package markeri;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Random rng = new Random();
		List<Marker> inventory = new ArrayList<>();
		int brand = 1;
		
		while(inventory.size() < 50) {
			try {
				Marker marker = new Marker("RandomBrand " + brand++, getRandomColor(rng), rng.nextBoolean(), getRandomThickness(rng), getRandomWeight(rng));
				inventory.add(marker);
			}catch(InvalidDataException e) {
				System.out.println(e.getMessage() + " This one does not go into the inventoy.");
			}
		}
		
		System.out.println(inventory.size());
		List<Marker> filteredInventory = new ArrayList<>();
		for(int i = 0; i < inventory.size(); i++) {
			if(i % 2 == 0) {
				filteredInventory.add(inventory.get(i));
			}
		}
		
		System.out.println(filteredInventory.size());
	}
	
	public static int getRandomThickness(Random rng) {
		return rng.nextInt(15) + 1;
	}
	
	public static Color getRandomColor(Random rng) {
		int num = rng.nextInt(4);
		Color color = null;
		
		switch(num) {
			case 0:
				color = Color.BLUE;
				break;
			case 1:
				color = Color.GREEN;
				break;
			case 2:
				color = Color.RED;
				break;
			case 3:
				color = Color.BLACK;
				break;
		}
		
		return color;
	}
	
	public static int getRandomWeight(Random rng) {
		return rng.nextInt(550);
	}
}
