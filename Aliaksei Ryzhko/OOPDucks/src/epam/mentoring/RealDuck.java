package epam.mentoring;

public class RealDuck extends Duck {
	private final static String REAL = "Real Duck";

	public RealDuck(String id) {
		super(id);
	}

	public void fly() {
		System.out.println("Fly");
	}

	public void drink() {
		System.out.println("Drink");
	}

	public void eat() {
		System.out.println("Eat");
	}
}
