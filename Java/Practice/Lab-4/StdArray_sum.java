public class StdArray_sum {
	public static void main(String[] args) {
		int[] a = new int[args.length];
		for(int i = 0 ; i < args.length; i++) {
			a[i] = Integer.parseInt(args[i]); 
		}
		System.out.println(StdArray.sum (a));
	}
}
