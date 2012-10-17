/*Skickar en array till metoden toString i klassen StringBuilder och skriver
ut den returnerade Strängen.*/

public class ToString {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = i;
		}
		StringBuilder c = totoString(a);
		System.out.print(c);
	}
	//Method "toString"
	public static StringBuilder totoString(int[] a) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			b.append(String.valueOf(a[i] + " "));
		}
		return b;
	}
}