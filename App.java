package OOPReview;

public class App {
  public static void main (String[]args) {
	Car car = new Car();
	
	System.out.println(car.toString());
	
	car.move();
	car.speedUp(10);
	car.speedUp(15);
	car.speedUp(20);
	car.speedUp(30);
	car.park();
  }
}
