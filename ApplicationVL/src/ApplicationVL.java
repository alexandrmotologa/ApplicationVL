
public class ApplicationVL {

	public static void main(String[] args) {
		Cup.printInfo();

	}

}

// parent class
class Cup {
	
	static int volume_mL = 500;
	
	static void printInfo() {
		int fill = 100 * Drink.volume_mL / volume_mL;
		
		if(Drink.volume_mL < volume_mL && Drink.volume_mL > 0 && fill != 0) {
			System.out.printf("=== Cup(%3dmL  %2d) ==\n", volume_mL, fill);
			Drink.printInfo();
			System.out.println("=====================");
		} else if(Drink.volume_mL == volume_mL || fill == 99) {
			System.out.printf("=== Full Cup ===\n");
		} else if(Drink.volume_mL >= 0  && fill == 0) {
			System.out.printf("=== Empty Cup ===\n");
		} else if((Drink.volume_mL < 0 || fill == 0) || (Drink.volume_mL > volume_mL || fill > 99)) {
			System.out.printf("=== Wrong Data ===\n");
		}
	}
	
	//child class
	static class Drink {
		static String name = "Tea";
		static int volume_mL = 250;
		
		static void printInfo() {
			System.out.printf("- Drink: %s - \n", name);
		}
	}
}