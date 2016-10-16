package epam.mentoring;

public class BehaviorServiceImpl implements BehaviorService {

	public void step(Behavior behavior, Direction direction, Duck duck) {
		int numberOfSteps = duck.getNumberOfSteps();
		if (duck instanceof FakeDuck) {
			if (numberOfSteps == 10) {
				changeBattery((FakeDuck) duck);
				duck.setNumberOfSteps(1);
			} else {
				duck.setNumberOfSteps(numberOfSteps + 1);
			}
			executeFakeDuckStep(behavior, direction, (FakeDuck) duck);

		} else if (duck instanceof RealDuck) {
			if (numberOfSteps == 10) {
				feed(behavior, (RealDuck) duck);
				duck.setNumberOfSteps(1);
			} else{duck.setNumberOfSteps(numberOfSteps + 1);}
				executeRealDuckStep(behavior, direction, (RealDuck) duck);
		}

	}

	private void feed(Behavior behavior, RealDuck duck) {
		duck.informHungry();
		if (behavior.equals(Behavior.FLY) || behavior.equals(Behavior.WALK)) {
			duck.eat();
		} else if (behavior.equals(Behavior.SWIM)) {
			duck.drink();
		}
	}

	private void changeBattery(FakeDuck duck) {
		for (int quack = 1; quack < 6; quack++) {
			duck.quack();
			if (quack == 5) {
				duck.informHungry();
				duck.changeBattery();
			}

		}

	}

	private void executeFakeDuckStep(Behavior behavior, Direction direction,
			FakeDuck duck) {
		if (behavior.equals(Behavior.FLITTER)) {
			duck.flitter();
		} else {
			executeGeneralStep(behavior, direction, duck);
		}
		System.out.println(direction.toString());
	}

	private void executeRealDuckStep(Behavior behavior, Direction direction,
			RealDuck duck) {
		if (behavior.equals(Behavior.FLITTER)) {
			duck.fly();
		} else {
			executeGeneralStep(behavior, direction, duck);
		}
		System.out.println(direction.toString());

	}

	private void executeGeneralStep(Behavior behavior, Direction direction,
			Duck duck) {
		if (behavior.equals(Behavior.WALK)) {
			duck.walk();
		} else if (behavior.equals(Behavior.SWIM)) {
			duck.swim();
		}

	}

}
