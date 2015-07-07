import java.util.ArrayList;


public class Building {
	ArrayList<Floor> FloorList=new ArrayList<Floor>();
	Elevetor elevetor;
	
	public Building(int n){
		
		for(int i=0;i<n;i++)
			FloorList.add(new Floor(i));
		elevetor=Elevetor.getInstance(FloorList);
		for(int i=0;i<n;i++)
			FloorList.get(i).setElevtor(elevetor);
		
	}

	public boolean requestFrom(int req_floor,String s) {
		Floor requested_floor=FloorList.get(req_floor);
		requested_floor.pressButton(s,FloorList);
		if(req_floor==elevetor.getFloorNumber())return true;
		return false;
	}


	public void setElevetorFloor(int n) {
		elevetor.setCurrentFloor(FloorList.get(n));
	}

	public void MoveTofloor() {
		Floor requested_floor=FloorList.get(elevetor.getPannelButton());
		elevetor.move(requested_floor);
	}

	public void pressPanelButton(int i) {
		elevetor.pressPannelButton(i);
	}

	public int getElevetorFloor() {
		return elevetor.getFloorNumber();
	}
	
	


}
