import java.util.ArrayList;


public class Pannel {
	Button[] PannelButton;
	
	public Pannel(ArrayList<Floor> floorList) {
		super();
		PannelButton=new Button[floorList.size()];
		for(int i=0;i<floorList.size();i++)
		PannelButton[i] = new Button(floorList.get(i));
	}
	
	
	public  int  getPressd_button(){
		 for(int i=0;i<PannelButton.length;i++)
			 if(PannelButton[i].isPressed())
				 return i;
		 
		 return -1;	 
	}
	
	public void setButton(int i){
		PannelButton[i].setPressed(true);
	}
	
	public ArrayList<Floor> getFloors(){
		ArrayList<Floor> ret=new ArrayList<Floor>();
		for(int i=0;i<PannelButton.length;i++){
			ret.add(PannelButton[i].getRefFloor());
		}
		return ret;
		
	}
}
