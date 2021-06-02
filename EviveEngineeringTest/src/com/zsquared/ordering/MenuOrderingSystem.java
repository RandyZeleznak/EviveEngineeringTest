package com.zsquared.ordering;

import java.util.Scanner;

import com.zsquared.ordering.menu.Breakfast;
import com.zsquared.ordering.menu.Dinner;
import com.zsquared.ordering.menu.Lunch;
import com.zsquared.ordering.menu.Menu;

public class MenuOrderingSystem {

	
	public static void main(String[] args) {
		
		String order;
		
		Scanner console = new Scanner(System.in);
		console.useDelimiter("\\D");
		System.out.print("Enter menu order : ");
		
				
		String input = console.nextLine(); 
		String [] tokens = input.split(" ");
		String menu = tokens[0];
		if(tokens.length == 2) {
		order = tokens[1];}
		else {
			System.out.println("Unable to process: Main is missing, side is missing");
			return;
		}
		System.out.println("-------------------------");
		
		
		
		Menu menutype = new Menu();
		switch(menu) {
		case "Breakfast":
			menutype = new Breakfast();
			break;
		case "Lunch":
			menutype = new Lunch();
			break;
		case "Dinner":
			menutype = new Dinner();
			break;
		default:
			System.out.println("Not valid menu");
		}
		
		menutype.printIt(order);
		console.close();
		
	}

}
