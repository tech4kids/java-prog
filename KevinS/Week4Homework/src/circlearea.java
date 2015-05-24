public class circlearea {

	private double radius = 1.0;
		private String col ="red";
		
	circlearea(){}
	circlearea(double r, String color){
		radius = r;
		col = color;
		
	}
	 
	public double getRadius() {
		return radius;
	}
			
	public double getArea()  {
		return radius*radius*3.14159;
		
	}
		
	public String getColor() {
		return col;
	}
		
	
	
	
	
	
}
