
public class Floor {
	int floor_number;
	String pressed_button;
	
	public Floor(int floor_number) {
		super();
		this.floor_number = floor_number;
		this.pressed_button = "" ;
	}

	public int getFloor_number() {
		return floor_number;
	}

	public void setFloor_number(int floor_number) {
		this.floor_number = floor_number;
	}

	public String getButton_pressed() {
		return pressed_button;
	}

	public void setButton_pressed(String button_pressed) {
		this.pressed_button = button_pressed;
	}
	
	
	
	
}
