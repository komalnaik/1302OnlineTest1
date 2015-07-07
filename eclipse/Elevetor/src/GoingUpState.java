
public class GoingUpState extends StatePattern{

	public GoingUpState() {
		super();
		currentState="up";
	}
	@Override
	public void switchState(String state, Elevetor e) {
		e.setCurrentState(new Idle());
	}

}
