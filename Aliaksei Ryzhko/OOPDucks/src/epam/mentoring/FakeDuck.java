package epam.mentoring;

public class FakeDuck extends Duck {
	private final static String FAKE = "Fake Duck";

	public FakeDuck(String id) {
		super(id);
	}

	public void flitter() {
		System.out.println("Flitter");
	}

	public void changeBattery() {
		System.out.println("Change battery");
	}

}
