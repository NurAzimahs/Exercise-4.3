
public class Mango extends Fruits {
	private int number;
	Mango(){
		super();
		this.name = "Mango";
		System.out.println("Mango is constructed");
		System.out.println("Price = RM" + CalcPrice());
		System.out.print("Enter the amount : ");
		number = s.nextInt();
	}
	
	public double CalcPrice(int number) {
		return price = number * CalcPrice();
	}
	
	public double CalcDiscount() {
		System.out.println("Mango have 40% off today");
		discountprice = price * 0.6;
		return discountprice;
	}
	
	public String toString() {
		return ("Total Price of Mango = RM" + CalcPrice(number) + "\n" + "Discounted Price = RM" + CalcDiscount());
	}
}
