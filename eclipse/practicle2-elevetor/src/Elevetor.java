import java.util.ArrayList;


public class Elevetor {
	Floor currentFloor;
	boolean doorOpen;
	ArrayList<Floor> Floor_list=new ArrayList<Floor>();
	
	public Elevetor(Floor currentFloor,ArrayList<Floor> Floor_list){
		this.currentFloor=currentFloor;
		doorOpen=true;
		this.Floor_list=Floor_list;
	}

	public void goUp(){
		
		int curentIndex = 0;
		if(curentIndex<Floor_list.size())
			curentIndex=currentFloor.getFloor_number();
		currentFloor=Floor_list.get(curentIndex+1);
		System.out.println("Eleveto in now at "+curentIndex+" floor");
	}
	
	public void goDown(){
		int curentIndex=currentFloor.getFloor_number();
		if(curentIndex>0)
		currentFloor=Floor_list.get(curentIndex-1);
		System.out.println("Eleveto in now at "+curentIndex+" floor");
	}
	
	public void move(int req_floor){
		while(req_floor<=currentFloor.getFloor_number() && currentFloor.getFloor_number()>0){
				goDown();
		}
		
		while(req_floor>=currentFloor.getFloor_number() && currentFloor.getFloor_number()<Floor_list.size()){
			goUp();
		}
		setDoorOpen(true);
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

	public void setDoorOpen(boolean doorOpen) {
		System.out.println("door is open");
		this.doorOpen = doorOpen;
	}

	public void moveToFloor(int move_to) {
		// TODO Auto-generated method stub
		System.out.println("Door Closed");
		while(move_to<currentFloor.getFloor_number()){
			goDown();
		}
		while(move_to>currentFloor.getFloor_number()){
			goUp();
		}
		System.out.println("Elevetor is at floor no "+move_to+" .\n Door Opened");
	}
	
	
}
