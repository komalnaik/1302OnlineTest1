
public class Idle extends StatePattern{

	public Idle() {
		super();
		currentState="idle";
	}

	@Override
	public void switchState(String state,Elevetor e) {
		if(state.equals("up")){
			e.setCurrentState(new GoingUpState());
		}
		if(state.equals("down")){
			e.setCurrentState(new GoingDownState());
		}
	}

}
