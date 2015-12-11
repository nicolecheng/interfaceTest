import java.util.*;

public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }
    
    public double getVolume(){
    	return Math.PI * (4/3) * Math.POW(getRadius(),3);
    }

    public String toString(){
	return "Sphere "+getName()+" with radius of "+getRadius();
    }
}
