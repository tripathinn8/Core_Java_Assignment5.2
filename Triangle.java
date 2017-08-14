
public class Triangle extends Figure
{

	void findArea(double dim1)
	{
		double area;
		area= 0.5*dim1*dim1;
		System.out.println("Area of the Triangle is"+ " " +area);
	}
	void findPerimeter(double dim1)
	{
		double perimeter;
		perimeter=dim1+dim1+dim1;
		System.out.println("Perimeter of the Triangle is"+ " " +perimeter);
	}
	public static void main(String[] args) 
	{
		Triangle obj2=new Triangle();
		obj2.findArea(2);
		obj2.findPerimeter(3);
	}

}
