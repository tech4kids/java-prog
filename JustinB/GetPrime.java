
class Ball
{
	private double x;
	private double y;
	private double radius;
	private double xDelta;
	private double yDelta;
	
	//constructor
	Ball(double x, double y, double radius, double pixels_per_step, double degrees)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		double slope = (double) Math.tan(degrees);
		this.yDelta = (double) Math.sqrt(((pixels_per_step*pixels_per_step)*(slope*slope))/((slope*slope) + 1));
		this.xDelta = yDelta / slope;
	}
	//getters and setters
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getXDelta()
	{
		return xDelta;
	}
	public double getYDelta()
	{
		return yDelta;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public void setXDelta(double xDelta)
	{
		this.xDelta = xDelta;
	}
	public void setYDelta(double yDelta)
	{
		this.yDelta = yDelta;
	}
	//methods
	public void move()
	{
		x += xDelta;
		y += yDelta;
	}
	public void reflecthorizontal()
	{
		xDelta = -xDelta;
	}
	public void reflectVertical()
	{
		yDelta = -yDelta;
	}
	public void display_Parameters()
	{
		System.out.println("Ball at (" + this.x + "," + this.y + ")");
		System.out.println("Ball at velocity of (" + this.xDelta + "," + this.yDelta + ")");
	}
}

class Container
{
	private double[] firstCoord = new double[2];
	private double[] secondCoord = new double[2];
	
	//constructors
	Container(double x, double y, double xLength, double yLength)
	{
		this.firstCoord[0] = x;
		this.firstCoord[1] = y;
		this.secondCoord[0] = xLength + x;
		this.secondCoord[1] = yLength + y;
	}
	//methods
	public void getpos()
	{
		System.out.println("Container at (" + this.firstCoord[0] + "," + this.firstCoord[1] + ") to (" + this.secondCoord[0] + "," + this.secondCoord[1] + ")");
	}
	public boolean collidesWith(Ball ball)
	{
		if (ball.getX() - ball.getRadius() <= this.firstCoord[0] || ball.getX() - ball.getRadius() >= this.secondCoord[1])
		{
			ball.reflecthorizontal();
			return true;
	    }
		if (ball.getY() - ball.getRadius() <= this.firstCoord[1] || ball.getY() - ball.getRadius() >= this.secondCoord[1])
		{
			ball.reflectVertical();
			return true;
	    }
		else
		{
			return false;
		}
	}
}

public class Application {

	public static void main(String[] args)
	{
		Ball ball = new Ball(50, 50, 5, 10, 30);
		Container box = new Container(0, 0, 100, 100);
		for (int step = 0; step < 100; ++step)
		{
		   ball.move();
		   box.collidesWith(ball);
		   ball.display_Parameters();
		}

	}

}
