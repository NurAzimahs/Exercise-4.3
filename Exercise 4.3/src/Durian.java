
public class Durian extends Fruits {
	private int number;
	private double weight = 2.5, price;
	Durian(){
		super();
		this.name = "Durian";
		System.out.println("Durian is constructed");
		System.out.println("Price per kg  = " + CalcPrice());
		System.out.println("Weight  = " + weight + "kg");
		System.out.print("Enter the amount : ");
		number = s.nextInt();
	}
	
	public double CalculatePrice(int number, double weight) {
		return price = number * weight * CalcPrice();
	}
	
	public double CalcDiscount() {
		System.out.println("Durian have 20% off today");
		discountprice = price * 0.8;
		return discountprice;
	}
	
	public String toString() {
		return ("Total Price of Durian = RM" + CalculatePrice(number,weight) + "\n" + "Discounted Price = RM" + CalcDiscount() );
	}
}
