package de.matsito.testsuper.TestSuper;

public abstract class Animal {

	private String name;
	private int geschwindigkeit;
	
	public Animal(String name, int i) {
		setName(name);
		setGeschwindigkeit(i);
	}
	
	public abstract void talking();
	
	public abstract void moving();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}
}
