package com.zsquared.ordering.menu;

public class Lunch extends Menu {
	
	
		private int sandwich = 0;
		private int chips = 0;
		private int soda = 0;
		public void printIt(String order) {
			String [] tokens = order.split(",");
			for(String token: tokens) {
				switch(token) {
				case "1":
					sandwich++;
					continue;
				case "2":
					chips++;
					continue;
				case "3":
					soda++;
					continue;
					default:
						System.out.println("INVALID INPUT");
				}
			}
			if(sandwich == 1 & chips == 1 & soda == 1)
				System.out.println("Sandwich, Chips, Soda");
			if(sandwich == 1 & chips == 1 & soda == 0)
				System.out.println("Sandwich, Chips, Water");
			if(sandwich == 1 & chips > 1 & soda == 1)
				System.out.println("Sandwich, Chips(" +chips+"), Soda");
			if(sandwich == 1 & chips > 1 & soda == 0)
				System.out.println("Sandwich, Chips(" +chips+"), Water");
			if(sandwich > 1)
				System.out.println("Unable to process: Sandwich cannot be ordered more then once");
	}

}
