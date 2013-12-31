
class Object
{
	private double mass;
	private int x;
	private int y;
	private int z;
	
	public double gravity(double mass1, double mass2,double distance)
	{
		
		return (6.67384*Math.pow(10, -11))*((mass1*mass2)/Math.pow(distance, 2));
	}
}

class CelestialBody
{
	
}

class ManMadeObject
{
	
}

public class Sanagami {
	public static void main(String[] args)
	{
	
	}
}
