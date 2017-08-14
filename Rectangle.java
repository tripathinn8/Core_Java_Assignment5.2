
public class Rectangle extends Figure 
{
	void findArea(double dim1)
	{
		double area;
		area= dim1*dim1;
		System.out.println("Area of the Rectangle is"+ " " +area);
	}
	void findPerimeter(double dim1)
	{
		double perimeter;
		perimeter=4*dim1;
		System.out.println("Perimeter of the Rectangle is"+ " " +perimeter);
	}
	public static void main(String[] args) 
	{
		Rectangle obj1 = new Rectangle();
		obj1.findArea(2);
		obj1.findPerimeter(3);

	}

}
