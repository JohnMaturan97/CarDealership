package com.born2code.servletdemo2;

import java.util.ArrayList;
import java.util.List;

public class CarDataUtil {

	public static List<Car> getCars() {
		
		// create an empty list
		List<Car> cars = new ArrayList<>();
		
		// add sample data
		cars.add(new Car("Surabru", "STI", "The King of Tokyo Drift"));
		cars.add(new Car("Tesla", "Model X", "Next generation of Gas-less vehicle"));
		cars.add(new Car("Porsche","911", "A timelimeless design, a contemporay interpretation"));
		cars.add(new Car("Lexus", "LC", "Got those who dae t oseek the extraordinary"));
		cars.add(new Car("BMW", "M5", "Unrivaled persormance, perfectly mastered"));
		cars.add(new Car("Toyota", "Tacoma", "Built for outdoors adventure"));
		cars.add(new Car("Honda", "Type R", "The Queen of the streeets"));
		cars.add(new Car("Chevolet", "Camaro", "This is pure adrenaline"));
		cars.add(new Car("Ram", "Ram 1500", "Heavy Duty will never be the same"));
		cars.add(new Car("Audi", "R8", "Born on the Race-Track"));
		
		// return the list
		return cars;
	}
}
		
		
		

		
		
		
		
		
		
		
		
		
		
