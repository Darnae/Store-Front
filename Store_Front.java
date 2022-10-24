package App;

import java.util.Random;

public class Store_Front

{
	private String Weapon_One = "Sword";
	private String Weapon_Two = "Pistals";
	private String Armor_One = "Helmet";
	private String Armor_Two = "Chest Plate";
	private String Store_name = "Store Front";
	private int Health;
	


	public static void main(String[] args) throws java.io.IOException
	{
	 int input;
	 
	 Random num = new Random();
		 	
	 Store_Front store = new Store_Front();
	 
	 store.Health = num.nextInt(100);
	 
	 System.out.println("Welcome to " + store.Store_name);
	 System.out.println("Items for sale: " + store.Weapon_One + store.Weapon_Two + store.Armor_One + store.Armor_Two);
	 System.out.println("User: Pick one 1 or 2 to buy a weapon. Pick 3 or 4 to buy Armor");
	 input = (int) System.in.read(); 
	 
	 if (input == '1')
	 {
		 System.out.println("You have picked: " + store.Weapon_One);
		 System.out.println("User has equiped legendary sword. Health points gained: 0. Offensive Weapons give no defense.");
		 
	 }
	 
	 if (input == '2')
	 {
		 System.out.println("You have picked: " + store.Weapon_Two);
		 System.out.println("User has equiped dual pistols. Health points gained: 0. Offensive Weapons give no defense.");
	 }
	 
	 if (input == '3')
	 {
		 System.out.println("You have picked: " + store.Armor_One);
		 System.out.println("User has equiped golden helm. Health points gained: " + store.Health);
	 }
	 
	 if (input == '4')
	 {
		 System.out.println("You have picked: " + store.Armor_Two);
		 System.out.println("User has equiped golden helm. Health points gained: " + store.Health);
	 }
	
	 
	System.out.println("Thank you for shopping at " + store.Store_name);
	 
	
	 
	}

}