
public class Lab_3_3a {
	public static void main(String[] args) {
		double xs0 = StdIn.readDouble();
		double xs1 = StdIn.readDouble();
		double ys0 = StdIn.readDouble();
		double ys1 = StdIn.readDouble();
		double x0 = StdIn.readDouble();
		double y0 = StdIn.readDouble();
		double x1 = StdIn.readDouble();
		double y1 = StdIn.readDouble();
		

		
		StdDraw.setXscale(xs0,xs1);
		StdDraw.setYscale(ys0,ys1);
		//		StdDraw.setPenColor(StdDraw.BLUE);
		//		StdDraw.setPenRadius(.01);
		StdDraw.line(x0, y0, x1, y1);
	}
	
}
