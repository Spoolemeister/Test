package de.matsito.testsuper.TestSuper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.craftbukkit.libs.jline.console.ConsoleReader;

public class TestSuper {
	
	private static boolean hasExit;
	
	public static void main(String[] args) {
		hasExit = false;
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Leopard());
		animals.add(new ClownFish());
		
		for (Animal animal : animals) {
			System.out.println("Der Name: " + animal.getName() + " die Geschwindigkeit: " + animal.getGeschwindigkeit());
		}
		
		ConsoleReader consoleReader = null;
		try {
			consoleReader = new ConsoleReader();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		String line;
		
		while (!(hasExit)) {
			try {
				line = consoleReader.readLine("> ");
				
				if (line.equals("bewegen")) {
					for (Animal animal : animals) {
						animal.moving();
					}
				} else if (line.equals("reden")) {
					for (Animal animal : animals) {
						animal.talking();
					}
				} else if (line.equals("exit")) {
					System.out.println("Das Programm schließt nun");
					hasExit = true;
				} else if (line.startsWith("getanimal")) {
					line.replace("getanimal ", "");
					
					for (Animal animal : animals) {
						if (animal.getName().equals(line)) {
							System.out.println("Der Name: " + animal.getName() + " die Geschwindigkeit: " + animal.getGeschwindigkeit());
						} else {
							System.out.println("Das Tier gibts net");	
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
