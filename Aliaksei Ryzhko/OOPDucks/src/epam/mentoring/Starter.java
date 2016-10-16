package epam.mentoring;

public class Starter {

	private final static String REAL = "Real Duck";
	private final static String FAKE = "Fake Duck";
	private final static String FAKESTART = "Start Fake Duck";
	private final static String REALSTART = "Start REAL Duck";
	private final static String FAKEHUNGRYDESCRIPTION = "After ten step duck quacked then stopped and change Battery";
	private final static String REALHUNGRYDESCRIPTION = "After ten step duck want eat or drink";

	public static void main(String[] args) {

		BehaviorService behaviorService = new BehaviorServiceImpl();
		RealDuck realDuck = new RealDuck(REAL);
		FakeDuck fakeDuck = new FakeDuck(FAKE);
		System.out.println(FAKESTART);
		behaviorService.step(Behavior.WALK, Direction.LEFT, fakeDuck);
		behaviorService.step(Behavior.SWIM, Direction.RIGHT, fakeDuck);
		behaviorService.step(Behavior.SWIM, Direction.FORWARD, fakeDuck);
		behaviorService.step(Behavior.SWIM, Direction.RIGHT, fakeDuck);
		behaviorService.step(Behavior.WALK, Direction.LEFT, fakeDuck);
		behaviorService.step(Behavior.WALK, Direction.BACKWARD, fakeDuck);
		behaviorService.step(Behavior.WALK, Direction.LEFT, fakeDuck);
		behaviorService.step(Behavior.WALK, Direction.LEFT, fakeDuck);
		behaviorService.step(Behavior.WALK, Direction.LEFT, fakeDuck);
		behaviorService.step(Behavior.WALK, Direction.LEFT, fakeDuck);
		System.out.println(FAKEHUNGRYDESCRIPTION);
		behaviorService.step(Behavior.WALK, Direction.LEFT, fakeDuck);
		behaviorService.step(Behavior.WALK, Direction.LEFT, fakeDuck);
		System.out.println(REALSTART);
		behaviorService.step(Behavior.WALK, Direction.LEFT, realDuck);
		behaviorService.step(Behavior.FLY, Direction.RIGHT, realDuck);
		behaviorService.step(Behavior.SWIM, Direction.BACKWARD, realDuck);
		behaviorService.step(Behavior.FLY, Direction.FORWARD, realDuck);
		behaviorService.step(Behavior.WALK, Direction.LEFT, realDuck);
		behaviorService.step(Behavior.WALK, Direction.BACKWARD, realDuck);
		behaviorService.step(Behavior.WALK, Direction.LEFT, realDuck);
		behaviorService.step(Behavior.WALK, Direction.LEFT, realDuck);
		behaviorService.step(Behavior.WALK, Direction.BACKWARD, realDuck);
		behaviorService.step(Behavior.SWIM, Direction.LEFT, realDuck);
		System.out.println(REALHUNGRYDESCRIPTION);
		behaviorService.step(Behavior.SWIM, Direction.LEFT, realDuck);
		behaviorService.step(Behavior.WALK, Direction.BACKWARD, realDuck);
	}

}
