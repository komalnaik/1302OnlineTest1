import java.util.ArrayList;


public class Building {
	ArrayList<Floor> Floor_list=new ArrayList<Floor>();
	int number_of_floors;
	Elevetor elevetor;
	
	public Building(){
		number_of_floors=5;
		for(int i=0;i<number_of_floors;i++){
			Floor_list.add(new Floor(i));
		}
		elevetor=new Elevetor(Floor_list.get(0), Floor_list);
	}
	
	
}
