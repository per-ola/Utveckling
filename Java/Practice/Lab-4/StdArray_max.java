/*Läser in en sträng med värden från kommandoraden och
returnerar det största av dess*/

public class StdArray_max {
	public static void main(String[] args) {
		int[] a = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		System.out.print(StdArray.max(a));
	}
}
