import java.lang.String;
public class StdArray_imp {
	public void main(String[] args) {
		private void append{
		//Konkatenerar två fält av heltal
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
			int[] c = append(a, b);
			//Skriver ut resulterande fält
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i]);
			}
			System.out.println();
			System.out.println();
		}
	}
	class max{
		public void main(String[] args){
			int[] a = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				a[i] = Integer.parseInt(args[i]);
			}
			System.out.print(StdArray.max(a));
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
