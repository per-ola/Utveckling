import java.util.Scanner;
public class Lab_3_3b_III
{
	public static void main(String[] args)
	{
		int a,b,c,xs0,xs1,ys0,ys1;
		double x=0;
		double y=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of xs0,xs1,ys0,xs1,a,b, and c");
		
		xs0=s.nextInt();
		xs1=s.nextInt();
		ys0=s.nextInt();
		ys1=s.nextInt();
		
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();

		int k=(b*b)-4*a*c;
		if(k<0)
		{
			System.out.println("No real roots");
		}
		else
		
		{
			double l=Math.sqrt(k);
			x=(-b-l)/2*a;
			y=(-b+l)/2*a;
		}
			
		if
		
		(x < -50 || y > 50)
		
		System.out.println("x is too large");
		
		else
			System.out.println("Roots of given equation:"+x+" "+y);
		double fn = 0;	
		
		for (double i = 0; i < 9000; i++)
		{
		
		fn = (a * Math.pow(i, 2) + b * i + c);
		StdDraw.setXscale(xs0,xs1);
		StdDraw.setYscale(ys0,ys1);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(1);
		StdDraw.point(i/100,fn/100);
		}

		
	}
}
