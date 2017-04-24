package Shape;
import java.util.Scanner;

public class Rectangle implements Polygon {
	private float length;		
	private	float breadth;
	private float area;
	private float perimeter;
	


	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the length");
		this.length=n.nextFloat();
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter the breadth");
		this.breadth=n1.nextFloat();
		area=length*breadth;
		System.out.println("Area of Rectangle is : "+area);


	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		
		perimeter=(length+breadth)*2;
		System.out.println("Perimeter of Rectangle is : "+perimeter);


	}

}
