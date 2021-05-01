
import java.util.Scanner;

public class Fruits {
	Scanner s = new Scanner(System.in);
	protected String name;
	protected double price, discountprice;
	public Fruits() {
			System.out.println("Fruit constructor is invoked");
		
	}
	
	public String ChooseFruit() {
		System.out.print("Choose the fruit (Durian/Mango): ");
		this.name = s.nextLine();
		while (this.name.equalsIgnoreCase("Durian")== false && this.name.equalsIgnoreCase("Mango")==false) {
			System.out.println("Wrong Input! Please choose Durian or Mango only!");
			System.out.print("Choose the fruit (Durian/Mango): ");
		}
		return this.name;
	}
	
	public double CalcPrice() {
		if (this.name == "Mango") {
			this.price = 1.4;
		}
		else if (this.name =="Durian") {
			this.price = 15.0;
		}
		return this.price;
	}
	
	
	public String toString() {
		return (ChooseFruit() + " is constructed \n" + "Price of " + this.name + " = RM" + CalcPrice());
	}
}
