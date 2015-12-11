import java.util.*;

public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }
    
    public double getArea(){
    	return Math.PI * (4/3) * radius * radius * radius;
    }

    public String toString(){
	return "Sphere "+getName()+" with radius of "+getRadius();
    }
}
