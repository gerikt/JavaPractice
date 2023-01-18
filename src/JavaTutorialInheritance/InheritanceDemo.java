package JavaTutorialInheritance;

public class InheritanceDemo {

	public static void main(String[] args) {

		MountainBike mb = new MountainBike(20,10,1);
		
		System.out.println("Gear is :" +mb.gear);
		System.out.println("Seat height is : " + mb.seatHeight);
		System.out.println("Bike speed is : " + mb.speed);
		mb.applyBrake(10);
		System.out.println("Bike speed after applying brakes is " + mb.speed);
	}

}
