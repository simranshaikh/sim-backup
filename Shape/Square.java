package Shape;
import java.util.Scanner;

public class Square implements Polygon {

	
	private float side ;
	private float area;
	private float perimeter;
	
	Scanner n=new Scanner(System.in);
	

	
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Enter the side of square");
		this.side=n.nextFloat();
		
		area=side*side;
		System.out.println("Area of Square is : "+area);

	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		
		perimeter=4*side;
		System.out.println("The perimeter is : "+perimeter);

	}

}
