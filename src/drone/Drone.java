package drone;

public  class Drone {
   int x;
   int y;
   int z;
   
	@Override
	public String toString() {
		return "Drone [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public Drone() {
		super();
	}
	public abstract String moveUp()
	{
		
	}

	

}
