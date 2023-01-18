package JavaTutorialInterfaces;

public class MountainBike implements Bicycle, Vehicle{
	
	private int seatHeight;
	private int gear;
	private int speed;
	
	public MountainBike(int startHeight,int startSpeed,int startGear)
	{
		seatHeight = startHeight;
		speed=startSpeed;
		gear=startGear;
		
	}
	
	public int getGear()
	{
		return gear;
	}
	public int getSeatHeight()
	{
		return seatHeight;
	}
	
	public int getSpeed()
	{
		return speed;
	}

	@Override
	public void applyBrake(int decrement) {

		speed = speed - decrement;
	}

	@Override
	public void speedUp(int increment) {

		speed = speed + increment;
		
		
	}

	
	@Override
	public void canDrive()
	{
		System.out.println("Mountain bike can be driven");
	}
}
