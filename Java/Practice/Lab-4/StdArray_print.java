/*Calls method "StdArray.print" that takes an array as an argument and
prints it to Standard out with a space between each index*/ 

public class StdArray_print {
	public static void main(String[] args) {	
		int t = 9;
		int[] a = new int[t];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = i;
		}
		StdArray.print(a);
	}
}
