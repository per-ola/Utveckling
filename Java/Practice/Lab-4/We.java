//import java.lang.String;
public class StdArray {
	public static void main(String[] args) {
		/*
		 * Ange funktion som skall testas som kommandoradsargument enligt nedan:
		 * 1: "append"
		 * 2: "belongs"
		 * 3: "max"
		 * 4: "print"
		 * 5: "range"
		 * 6: "sum"
		 * 7: "toString"
		 * 8: "plotBars"
		 */
		int val = Integer.parseInt(args[0]);
		if (val == 1) {
			int[] a = new int[5];
			int[] b = new int[5];
			int m = a.length;
			//Skriver ut första fältet
			for(int i = 0; i < a.length; i++) {
				a[i] = i+1;
				System.out.print(a[i]);
			}
			System.out.println();
			System.out.println();
			//Skriver ut andra fältet
			for(int j = 0; j < b.length; j++) {
				b[j] = (++m);
				System.out.print(b[j]);
			}
			System.out.println();
			System.out.println();
			//Anropar metoden "append" i klassen "StdArray"
			int[] c = StdArray.append(a, b);
			//Skriver ut resulterande fält
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i]);
			}
			System.out.println();
			System.out.println();
		}
		else if (val == 2) {
			int x = 4;
			int[] a = new int[5];
			for(int i = 0; i < a.length; i++) {
				a[i] = i;
			}
			boolean b = StdArray.belongs(x, a);
			System.out.print(b);
		}
		else if (val == 3) {
			int[] a = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				a[i] = Integer.parseInt(args[i]);
			}
			System.out.print(StdArray.max(a));
		}
		else if (val == 4) {
			int t = 9;
			int[] a = new int[t];
			for (int i = 0; i < a.length; i++)
			{
				a[i] = i;
			}
			StdArray.print(a);
		}
		else if (val == 5) {
			// Skriver ut ett fält med värden från 10 till 20.
			for(int i = 0; i < StdArray.range(10, 20).length; i++) {
				System.out.print(StdArray.range(10, 20)[i]);
			}
		}
		else if (val == 6) {
			int[] a = new int[args.length];
			for(int i = 0 ; i < args.length; i++) {
				a[i] = Integer.parseInt(args[i]); 
			}
			System.out.println(StdArray.sum (a));
		}
		else if (val == 7) {
			int[] a = new int[10];
			for (int i = 0; i < 10; i++) {
				a[i] = i;
			}
			StringBuilder c = StdArray.toString(a);
			System.out.print(c);
		}
		else if (val == 8) {
			int a[] = new int[10];
			for(int i = 0; i < a.length; i++) {
				a[i] = i + 1;
			}
			StdArray.plotBars(a);
		}
	}
	//Method "append"
	public static int[] append(int[] a, int[] b)
	{
		int x = a.length;
		int y = b.length;
		int[] array = new int[x+y];
		for (int i = 0; i < x; i++){
			array[i] = a[i];
		}
		for (int i = 0; i < y; i++){
			array[x++] = b[i];
		}
		return array;
	}
	//Metod "average"
	public static double average(int[] a){
		return (double)sum(a)/a.length;
	}
	//Method "belongs"

	public static boolean belongs(int x, int[] a){
		for(int elem : a){
			if(x==elem) {return true;}
		}
		return false;
	}
	//Method "max"
	public static int max(int[] a) {
		int max = Integer.MIN_VALUE;
		int val;
		for(int i = 0 ; i<a.length; i++){
			val = (a[i]);
			if(max<val){
				max = val;
			}
		}
		return max;
	}
	//Method "print"
	public static void print(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");	
		}
	}
	//Method "range"
	public static int[] range(int a, int b)
	{
		int[] seq = new int[b-a+1];
		for(int i = 0; i<seq.length; i++)
		{
			seq[i] = i + a;
		}
		return seq;
	}
	//Method "sum"
	public static int sum(int[] a)
	{
		int s = 0;
		for(int i=0; i < a.length; i++)
		{
			s = s + a[i];
		}
		return s;
	}
	//Method "toString"
	public static StringBuilder toString(int[] a)
	{
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			b.append(String.valueOf(a[i] + " "));
		}
		return b;
	}
	//Method "plotBars"
	public static void plotBars(int[] a) {
		StdDraw.setXscale(0,100);
		StdDraw.setYscale(0,100);
		for(int i=0; i < a.length; i++) {
			StdDraw.filledRectangle((int) (a[i] * 10), (int) ((a[i] * 10)/2), (int) 1,5 * a[i]);
		}
	}
}