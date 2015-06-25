import java.util.ArrayList;
import java.util.Scanner;


public class Main_Class {

	public static void main(String[] args) {
		
		
		ArrayList<Floor> Floor_list=new ArrayList<Floor>();
		int number_of_floors;
		Elevetor elevetor;
		
		
		number_of_floors=5;
		for(int i=0;i<number_of_floors;i++){
			Floor_list.add(new Floor(i));
		}
		
		elevetor=new Elevetor(Floor_list.get(0), Floor_list);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your current floor number");
		int requestFrom=sc.nextInt();
		elevetor.move(requestFrom);
		System.out.println("Enter which floor you want to go ");
		int move_to=sc.nextInt();
		
		elevetor.moveToFloor(move_to);
		
	}

}
