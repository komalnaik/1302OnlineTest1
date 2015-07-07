
public abstract class StatePattern {
	String currentState;
	public abstract void switchState(String state,Elevetor e) ;
	public String getCurrent_state() {
		return currentState;
	}
	public void setCurrent_state(String current_state) {
		this.currentState = current_state;
	}

	
}
