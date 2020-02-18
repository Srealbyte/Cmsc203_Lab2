import java.util.*;
import java.math.*;
public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add your declaration and code here
		Scanner keyboard = new Scanner(System.in);
		Double diam;
		Double volume;
		System.out.println("This Program can caculate the radius and the volume\ngiven by the value of the diameter");
		System.out.println("Enter the value of the Diameter of the sphere:");
		diam=keyboard.nextDouble();
		Double radius = diam/2.0;
		System.out.println(radius);
		System.out.println(4.0/3.0);
		volume= ((4.0/3.0)*Math.PI)*Math.pow(radius, 3);
		System.out.println("Volume: "+volume);
		
		
	}

}
