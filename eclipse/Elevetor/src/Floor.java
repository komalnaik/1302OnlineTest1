import java.util.ArrayList;


public class Floor {
	int floorNumber;
	FloorButton buttonPressed;
	Elevetor elevtor;
	public Floor(int floor_number) {
		super();
		this.floorNumber = floor_number;
		
	}

	public int getFloor_number() {
		return floorNumber;
	}

	public void setFloor_number(int floor_number) {
		this.floorNumber = floor_number;
	}
	
	public String getPressedButton(){
		if(buttonPressed instanceof FloorUpButton){return "up";}
		if(buttonPressed instanceof FloorDownButton){return "down";}
		return null;
	}
	
	public void pressButton(String s, ArrayList<Floor> floor_list) {
		FloorButtonFactory f=new FloorButtonFactory();
		buttonPressed=f.getFloorButton(s);
		elevtor.moveToReq(this);
	}

	public Elevetor getElevtor() {
		return elevtor;
	}

	public void setElevtor(Elevetor elevtor) {
		this.elevtor = elevtor;
	}
	
	
}
