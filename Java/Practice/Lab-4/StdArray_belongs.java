
public class StdArray_belongs {
	public static void main(String[] args) {
		int x = 4;
		int[] a = new int[5];
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
	}
		boolean b = StdArray.belongs(x, a);
		System.out.print(b);
	}

}
