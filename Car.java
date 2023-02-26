package OOPReview;

public class Car implements Vehicle{
	
	private final int MAX_GEAR = 5;
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
		System.out.println("Parking...");
		while (speed>0 && gear>MIN_GEAR) {
		speedDown(10);
		}
		System.out.println("Car stopped..it is safe to get out");
		
	}

	@Override
	public int speedUp(int increment) {
		speed+=increment;
		if (gear<MAX_GEAR)
			gear++;
		System.out.println("Speed: "+speed+ "Gear: "+ gear); 
		return speed;
	}

	@Override
	public int speedDown(int decrement) {
		 speed -= decrement;
		   if (gear>MIN_GEAR)
			   gear--;
		   System.out.println("Speed: "+speed+ "Gear: "+ gear); 
			return speed;
		}  
}
