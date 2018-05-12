package de.matsito.testsuper.TestSuper;

public class Leopard extends Animal {

	public Leopard() {
		super("Leopard", 58);
	}

	@Override
	public void talking() {
		System.out.println("Raor");
	}

	@Override
	public void moving() {
		System.out.println("Tap tap tap");
	}
}
