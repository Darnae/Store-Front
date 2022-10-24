package App;

import java.util.Random;

public class Product 

{
	
	private int stock;
	private int price;
	private String name;



	public int getStock()
	
	{
		Random rand = new Random();
		
		stock = rand.nextInt(10);
		
		return stock;
	}
	
	public int getPrice()
	
	{
		price = 2;
		return price;
	}
	
	public String getName()
	
	{
		name = "Donuts";
		return name;
	}
	
	

	public static void main(String[] args) 
	
	{
		Product product = new Product();
		
		System.out.println("There are " + product.getStock() + " " + product.getName() + " in stock.");
		System.out.println("It costs $" + product.getPrice() + " dollars per product.");
		
		int total = product.price * product.stock;
		
		System.out.println("Buying all them now would cost $" + total + " dollars");
	}

}
