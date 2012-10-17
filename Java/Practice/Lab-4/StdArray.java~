import java.lang.String;
public class StdArray
{
	//Method "print"
	public static void print(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");	
		}
	}
	//Method "toString"
	public static StringBuilder toString(int[] a)
	{
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			b.append(String.valueOf(a[i]));
		}
		return b;
	}
	//Method "belongs"
	
			public static boolean belongs(int x, int[] a){
			for(int elem : a){
			if(x==elem) {return true;}
			}
			return false;
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
	//Method "average"
	public static double average(int[] a){
		return (double)sum(a)/a.length;
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

	public static void plotBars(int[] a) {
		StdDraw.setXscale(0,100);
		StdDraw.setYscale(0,100);
		for(int i=0; i < a.length; i++) {
			StdDraw.filledRectangle((int) (a[i] * 10), (int) ((a[i] * 10)/2), (int) 1,5 * a[i]);
		}
	}
}
