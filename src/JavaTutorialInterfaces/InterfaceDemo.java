package JavaTutorialInterfaces;

public class InterfaceDemo {

	public static void main(String[] args) {

		MountainBike mountainbike = new MountainBike(20,10,1);
		
		System.out.println("Gear is : " + mountainbike.getGear());
		System.out.println("Seat height  is : " + mountainbike.getSeatHeight());
		System.out.println("Speed  is : " + mountainbike.getSpeed());

		mountainbike.applyBrake(1);
		System.out.println("Bike speed after braking is : " + mountainbike.getSpeed());
		
		mountainbike.speedUp(10);
		System.out.println("Bikes new speed after increment is : " + mountainbike.getSpeed());
	}

}
