
public class Circle extends Figure
{

	void findArea(double dim1)
	{
		double area;
		area= 3.14*dim1*dim1;
		System.out.println("Area of the circle is"+ " " +area);
	}
	
	void findPerimeter(double dim1)
	{
		double perimeter;
		perimeter=2*3.14*dim1;
		System.out.println("Perimeter of the circle is"+ " " +perimeter);
	}
	public static void main(String[] args) 
	{
		Circle obj=new Circle();
		obj.findArea(2);
		obj.findPerimeter(3);
		
	}

}
