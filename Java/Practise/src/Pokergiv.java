public class Pokergiv {
  public static void main(String[] args) {
    int[] deck = new int[52];
    String[] suits = {"Spader", "Hjärter", "Klöver", "Ruter"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "Knekt", "Dam", "Kung"};
        
    // Kortleken initialiseras
    for (int i = 0; i < deck.length; i++)
      deck[i] = i;
    
    // Korten blandas
    for (int i = 0; i < deck.length; i++) {
      // Ett index genereras slumpmässigt
      int index = (int)(Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index]; 
      deck[index] = temp;
    }

    // Display the first four cards
    int N = Integer.parseInt(args[0]);
    for (int j =0; j < N; j++) {
    		
    
    for (int i = 0; i < 5; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.print("Kort nummer " + deck[i] + ": " 
        + rank + " av " + suit + " ");
    }
    System.out.println();
    System.out.println();
    }
  }
}