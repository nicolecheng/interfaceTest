
public class Prism extends Rectangle implements Volume{

    private double height;

    public Prism(double length, double width, double height, String name){
	super(length,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }
    
    public double getVolume(){
    	return getLength() * getWidth() * getHeight();
    }

    public String toString(){
	return "Prism "+getName()+" with a length of "+getLength()+
	", a width of "+getWidth()+", and a height of "+getHeight();
    }
}
