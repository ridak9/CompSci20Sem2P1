package ClassDemos.Rectangle;

public class Rectangle 
{
	private double length, width;
	
	public Rectangle() //Default Constructor method
	{
		length = 1;
		width = 1;		
	}
	
	//Overloading the default constructor method
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	//Modifier methods start with set
	public void setLength(double newL)
	{
		length = newL;
	}
	
	public void setWidth(double newW)
	{
		width = newW;
	}
	
	//Accessor methods start with get
	public double getLength()
	{
		return length;
		
	}
	
	public double getWidth()
	{
		return width;
		
	}
	
	public double area()
	{
		double rectArea;
		
		rectArea = length * width;
		
		return rectArea;
	}


}
