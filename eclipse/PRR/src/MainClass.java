import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of floor in building=>");
		Building e=new Building(sc.nextInt());
		System.out.println("Enter current floor of elevetor ");
		e.setElevetorFloor(sc.nextInt());
		
		System.out.println("Enter your current floor number");
		System.out.println(" and where you want to go up /down");
		if(e.requestFrom(sc.nextInt(),sc.next())){
			System.out.println("Enter which floor you want to move");
			e.pressPanelButton(sc.nextInt());
			e.MoveTofloor();
			System.out.println("Current floor of elevetor: "+e.getElevetorFloor());
		}
		else{
			System.out.println("cannot move to requested floor");
		}
		sc.close();
	}

}
