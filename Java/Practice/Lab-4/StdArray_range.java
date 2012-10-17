//Anropar metoden range i klassen StdArray. 

public class StdArray_range {
	public static void main(String[] args) {
		// Skriver ut ett fält med värden från 10 till 20.
		for(int i = 0; i < StdArray.range(10, 20).length; i++) {
			System.out.print(StdArray.range(10, 20)[i]);
		}
	}
}