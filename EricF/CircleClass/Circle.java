

public class Circle
{
    private double rad=1.0;
         private String col="red";
    
    
    Circle(){}
    
    Circle(double r, String color){
        rad=r;
        col=color;       
    }

    public double GetRadius(){
        return rad; 
    }
 
    public double GetArea(){
        return rad*rad*3.14159;
    }
 
    public String GetColor(){
        return col;
    }
    
}

