
public class StdArray_doubleArray {
	public static void main(String[] args) {
		int[] a = new int[args.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(args[i]);			
		}
		System.out.println();
		for (int i = 0; i < StdArray.doubleArray(a).length; i++) {
			System.out.print(StdArray.doubleArray(a)[i] + " ");
		}
	}

}
