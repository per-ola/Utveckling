public class Pokergiv {
  public static void main(String[] args) {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "Jack", "Queen", "King"};
        
    // Kortleken initialiseras
    for (int i = 0; i < deck.length; i++)
      deck[i] = i;
    
    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      // Generate an index randomly
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
      System.out.print("Card number " + deck[i] + ": " 
        + rank + " of " + suit + " ");
    }
    System.out.println();
    System.out.println();
    }
  }
}