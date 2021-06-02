package com.zsquared.ordering.menu;

public class Breakfast extends Menu {
	
	private int eggs = 0;
	private int toast = 0;
	private int coffee = 0;
	public void printIt(String order) {
		
		String [] tokens = order.split(",");
		for(String token: tokens) {
			switch(token) {
			case "1":
				eggs++;
				continue;
			case "2":
				toast++;
				continue;
			case "3":
				coffee++;
				continue;
				default:
					System.out.println("INVALID INPUT");
			}
		}
		if(eggs == 1 & toast == 1 & coffee == 1)
		System.out.println("Eggs, Toast, Coffee");
		if(eggs == 1 & toast == 1 & coffee > 1)
			System.out.println("Eggs, Toast, Coffee(" +coffee+")");
		if(toast == 0)
			System.out.println("Unable to process: Side is missing");
		
	}

}
