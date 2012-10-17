public class StdArray_plotbars {
	public static void main(String[] args) {
		int a[] = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		StdArray.plotBars(a);
	}
}
