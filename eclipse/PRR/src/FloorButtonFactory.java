
public class FloorButtonFactory {
	
	public FloorButton getFloorButton(String type){
		if(type.equals("up"))
			return new FloorUpButton();
		else
			return new FloorDownButton();
		}
	
}
