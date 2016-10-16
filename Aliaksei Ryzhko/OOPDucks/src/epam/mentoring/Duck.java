package epam.mentoring;

abstract class Duck {

	private final String id;
	private int numberOfSteps;

	public void setNumberOfSteps(int numberOfSteps) {
		this.numberOfSteps = numberOfSteps;
	}

	public Duck(final String id) {
		this.id = id;
	}

	public void walk() {
		System.out.println("Walk");

	}

	public void swim() {
		System.out.println("Swim");
	}

	public void quack() {
		System.out.println("Quack");
	}

	public void informHungry() {
		System.out.println("Hungry");
	}

	public int getNumberOfSteps() {
		return numberOfSteps;
	}
}