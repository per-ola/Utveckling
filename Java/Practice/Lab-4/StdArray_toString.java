public class StdArray_toString {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = i;
		}
		StringBuilder c = StdArray.toString(a);
		System.out.print(c);
	}
}