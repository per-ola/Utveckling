//Konkatenerar två fält av heltal

public class StdArray_append {

	public static void main(String[] args) {

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
		
		int[] c = StdArray.append(a, b);
		
		//Skriver ut resulterande fält

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
		
		System.out.println();
		System.out.println();

	}

}