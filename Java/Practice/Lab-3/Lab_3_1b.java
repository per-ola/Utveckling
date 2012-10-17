public class Lab_3_1b
{
    public static void main(String[] args)
    {
    	StdOut.println();
    	StdOut.println("Ange 1-10 tal i intervallet 0.0-0.9:");
    	StdOut.println();
    	StdOut.println("Ctrl-D för att visa resultatet eller avbryta");
    	StdOut.println();
    	int[] a = new int[10];
    	while (!StdIn.isEmpty()) {
            double t = StdIn.readDouble();
            if (t >= 0 && t < 0.1)
            	a[0] = a[0] + 1;
            else if (t >= 0.1 && t < 0.2)
            	a[1] = a[1] + 1;
            else if (t >= 0.2 && t < 0.3)
            	a[2] = a[2] + 1;
            else if (t >= 0.3 && t < 0.4)
        		a[3] = a[3] + 1;
            else if (t >= 0.4 && t < 0.5)
        		a[4] = a[4] + 1;
        	else if (t >= 0.5 && t < 0.6)
        		a[5] = a[5] + 1;
            else if (t >= 0.6 && t < 0.7)
        		a[6] = a[6] + 1;
            else if (t >= 0.7 && t < 0.8)
        		a[7] = a[7] + 1;
            else if (t >= 0.8 && t < 0.9)
        		a[8] = a[8] + 1;
            else if (t >= 0.9 && t < 1)
        		a[9] = a[9] + 1;
            else
            {
        		StdOut.println();	
            	StdOut.println("Talet/talen faller inte inom angivna intervall");
        	}
        }
        StdOut.println();
        StdOut.println("Antalet tal i respektive intervall:");
        StdOut.println();
        StdOut.println("[0,0.1):   " + a[0] + "\n" + "[0.1,0.2): " + a[1] + "\n" + "[0.2,0.3): " + a[2] + "\n" + "[0.3,0.4): " + a[3] + "\n" + "[0.4,0.5): " + a[4] + "\n" + "[0.5,0.6): " + a[5]
        		+ "\n" + "[0.6,0.7): " + a[6] + "\n" + "[0.7,0.8): " + a[7] + "\n" + "[0.8,0.9): " + a[8] + "\n" + "[0.9,1):   " + a[9] + "\n");
        
          
 
         
        StdDraw.setXscale(0,25);
		StdDraw.setYscale(0,100);
		StdDraw.filledRectangle((double) 5, (double) 50, (double) 0.5,10 * a[0]);
		StdDraw.filledRectangle((double) 7, (double) 50, (double) 0.5,10 * a[1]);
		StdDraw.filledRectangle((double) 9, (double) 50, (double) 0.5,10 * a[2]);
		StdDraw.filledRectangle((double) 11, (double) 50, (double) 0.5,10 * a[3]);
		StdDraw.filledRectangle((double) 13, (double) 50, (double) 0.5,10 * a[4]);
		StdDraw.filledRectangle((double) 15, (double) 50, (double) 0.5,10 * a[5]);
		StdDraw.filledRectangle((double) 17, (double) 50, (double) 0.5,10 * a[6]);
		StdDraw.filledRectangle((double) 19, (double) 50, (double) 0.5,10 * a[7]);
		StdDraw.filledRectangle((double) 21, (double) 50, (double) 0.5,10 * a[8]);
		StdDraw.filledRectangle((double) 23, (double) 50, (double) 0.5,10 * a[9]);
          
 
    }
}
