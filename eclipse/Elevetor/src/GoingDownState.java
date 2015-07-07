
public class GoingDownState extends StatePattern{

	public GoingDownState() {
		super();
		currentState="down";
	}

	@Override
	public void switchState(String state, Elevetor e) {
		e.setCurrentState(new Idle());
	}

}
