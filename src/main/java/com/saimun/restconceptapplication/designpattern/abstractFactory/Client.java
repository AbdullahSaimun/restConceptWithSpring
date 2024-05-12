package com.saimun.restconceptapplication.designpattern.abstractFactory;


/// Abstract Product A
interface Button {
	void render();
}

// Concrete Product A1
class MacOSButton implements Button {
	@Override
	public void render() {
		System.out.println("Rendering MacOS button");
	}
}

// Concrete Product A2
class WindowsButton implements Button {
	@Override
	public void render() {
		System.out.println("Rendering Windows button");
	}
}

// Abstract Product B
interface Checkbox {
	void render();
}

// Concrete Product B1
class MacOSCheckbox implements Checkbox {
	@Override
	public void render() {
		System.out.println("Rendering MacOS checkbox");
	}
}

// Concrete Product B2
class WindowsCheckbox implements Checkbox {
	@Override
	public void render() {
		System.out.println("Rendering Windows checkbox");
	}
}

// Abstract Factory
interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}

// Concrete Factory 1
class MacOSFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}

// Concrete Factory 2
class WindowsFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
public class Client {
	private GUIFactory factory;

	public Client(GUIFactory factory) {
		this.factory = factory;
	}

	public void render() {
		Button button = factory.createButton();
		Checkbox checkbox = factory.createCheckbox();

		button.render();
		checkbox.render();
	}

	public static void main(String[] args) {
		Client client = new Client(new MacOSFactory());
		client.render();

		client = new Client(new WindowsFactory());
		client.render();
	}
}
