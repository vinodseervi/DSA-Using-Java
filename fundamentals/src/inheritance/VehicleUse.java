package inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.color="Red";
		v.maxspeed = 100;
		v.print();
		
		Car c = new Car();
		c.color = "Black";
		c.maxspeed = 200;
		c.numDoors = 4;
		c.print();
	

	}

}
