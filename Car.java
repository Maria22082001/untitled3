package OOPReview;

public class Car implements Vehicle{
	
	private final int MAX_GEAR =5;
	private final int MIN_GEAR = 0;
    
	private int  speed=0;
	private int gear=0;
	private carType type ;
	
	
	public Car() {
		this.speed=0;
		this.gear=0;
		this.type= carType.MANUAL;
	}
	public Car(int speed, int gear, carType type) {
		super();
		this.speed = speed;
		this.gear = gear;
		this.type = type;
	}
	public String toString() {
		return "Car [speed=" + speed + ", gear=" + gear + ", type=" + type + "]";
	}
	@Override
	public void move() {
		System.out.println("Car is starting");
		speedUp(5);
		
	}

	@Override
	public void park() {
		// TODO Auto-generated method stub
		System.out.println("Parking...");
		while 
	}

	@Override
	public int speedUp(int increment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int speedDown(int decrement) {
		// TODO Auto-generated method stub
		return 0;
	}

}
