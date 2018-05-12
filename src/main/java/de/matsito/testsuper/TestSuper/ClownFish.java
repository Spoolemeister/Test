package de.matsito.testsuper.TestSuper;

public class ClownFish extends Animal {

	public ClownFish() {
		super("Clownfish", 2);
	}

	@Override
	public void talking() {
		System.out.println("Blub blub blub");
	}

	@Override
	public void moving() {
		System.out.println("blublablubla");
	}

}
