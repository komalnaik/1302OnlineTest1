import java.util.ArrayList;



public class Elevetor {
	static Elevetor myInstance=null;
	private Floor currentFloor;
	private ElevetorDoor doorOpen;
	private Pannel buttonPannel;
	private StatePattern currentState;
	
	
	private Elevetor(ArrayList<Floor> floorList) {
		super();
		this.currentFloor = floorList.get(0);
		this.doorOpen = new ElevetorDoor();
		this.buttonPannel = new Pannel(floorList);
		this.currentState = new Idle();
	}
	public static Elevetor getInstance(ArrayList<Floor> floorList){
		if(myInstance==null){
			myInstance=new Elevetor(floorList);
		}
		return myInstance;
		
	}
	
	public String getCurrent_state() {
		return currentState.getCurrent_state();
	}

	private void goUp(Floor requested_floor){
		int nextFloorIndex=currentFloor.getFloor_number()+1;
		ArrayList<Floor> floor_list=buttonPannel.getFloors();
		if(requested_floor.equals(currentFloor) )return;
		
		currentState.switchState("up", this);
		
		setCurrentFloor(floor_list.get(nextFloorIndex));
		
		goUp(requested_floor);
	}
	
	private void goDown(Floor requested_floor){
		int nextFloorIndex=currentFloor.getFloor_number()-1;
		
		ArrayList<Floor> floor_list=buttonPannel.getFloors();
		
		if(requested_floor.equals(currentFloor) )return;
		
		currentState.switchState("down", this);
		
		setCurrentFloor(floor_list.get(nextFloorIndex));
		
		goDown(requested_floor);
	}
	
	public Floor getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(Floor currentFloor) {
		this.currentFloor = currentFloor;
	}
	
	public void pressPannelButton(int n){
		buttonPannel.setButton(n);
		close_door();
	}
	
	public int getPannelButton(){
		return buttonPannel.getPressd_button();
	}
	public void open_door(){
		currentState.switchState("idle",this);
		doorOpen.openDoor();
	}
	public void close_door(){
		doorOpen.closeDoor();
	}
	public boolean isDoorOpen(){
		return doorOpen.isDoor_open();
	}
	public int getFloorNumber(){
		return currentFloor.getFloor_number();
	}
	
	public void move(Floor requested_floor) {
		if(getFloorNumber()< requested_floor.getFloor_number()){
			
			goUp(requested_floor);
		}
		if(getFloorNumber()>requested_floor.getFloor_number()){
			goDown( requested_floor);
		}
		if(getFloorNumber()==requested_floor.getFloor_number()){
			open_door();
		}
	}

	public void moveToReq(Floor requested_floor) {
			String userReq=requested_floor.getPressedButton();
			String elevetorState=getCurrent_state();
			 if(userReq.equals(elevetorState) || elevetorState.equals("idle")){
						move(requested_floor);
						
			  }	
				
	}
	public StatePattern getCurrentState() {
		return currentState;
	}
	public void setCurrentState(StatePattern currentState) {
		this.currentState = currentState;
	}
	
}
