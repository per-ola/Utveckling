public class Pokergiv {
  public static void main(String[] args) {
    int[] lek = new int[52];
    String[] farg = {"Spader", "Hjärter", "Klöver", "Ruter"};
    String[] varde = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "Knekt", "Dam", "Kung"};
        
    // Kortleken initialiseras
    for (int i = 0; i < lek.length; i++)
      lek[i] = i;
    
    // Korten blandas
    for (int i = 0; i < lek.length; i++) {
      // Ett index genereras slumpmässigt
      int index = (int)(Math.random() * lek.length);
      int temp = lek[i];
      lek[i] = lek[index]; 
      lek[index] = temp;
    }

    // Display the first four cards
    int N = Integer.parseInt(args[0]);
    for (int j =0; j < N; j++) {
    		
	//Skriv ut fem kort
    for (int i = 0; i < 5; i++) {
      String farg = fart[lek[i] / 13];
      String varde = varde[lek[i] % 13];
      System.out.print("Kort nummer " + lek[i] + ": " 
        + varde + " av " + farg + " ");
    }
    System.out.println();
    System.out.println();
    }
  }
}