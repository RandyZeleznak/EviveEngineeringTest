package com.zsquared.ordering.menu;

public class Dinner extends Menu {
	
	private int steak = 0;
	private int potatoes = 0;
	private int wine = 0;
	private int cake = 0;
	public void printIt(String order) {
		String [] tokens = order.split(",");
		for(String token: tokens) {
			switch(token) {
			case "1":
				steak++;
				continue;
			case "2":
				potatoes++;
				continue;
			case "3":
				wine++;
				continue;
			case "4":
				cake++;
				continue;
			default:
					System.out.println("INVALID INPUT");
			}
		}
		if(steak == 1 & potatoes == 1 & wine == 1 & cake == 1)
		System.out.println("Steak, Potatoes, Wine, Water, Cake");
		if(steak == 1 & potatoes > 1 & wine == 1)
			System.out.println("Steak, potatoes(" +potatoes+"), wine");
		if(steak == 1 & potatoes == 1 & wine == 0 && cake == 1)
			System.out.println("Steak, Potatoes, Water, Cake");
		if(cake == 0)
			System.out.println("Unable to process: Dessert is missing");
	}

}
