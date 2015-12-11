import java.util.*;

public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }
    
    public double getVolume(){
    	return getArea() * (4/3) * getRadius();
    }

    public String toString(){
	return "Sphere "+getName()+" with radius of "+getRadius();
    }
}
