
public class Button {
	Floor refFloor;
	boolean pressed;
	public Button(Floor floor) {
		super();
		refFloor=floor;
	}
	public boolean isPressed() {
		// TODO Auto-generated method stub
		return pressed;
	}
	public void setPressed(boolean b) {
		// TODO Auto-generated method stub
		pressed=b;
	}
	public Floor getRefFloor() {
		return refFloor;
	}
	public void setRefFloor(Floor refFloor) {
		this.refFloor = refFloor;
	}
	
	
}
