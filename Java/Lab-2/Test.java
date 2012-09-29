
//En klass deklareras

public class Pokergiv {

    //En "main"-metod.

  public static void main(String[] args) {

      //Skapar en array  "deck" av typen int med 52 platser simulerande en kortlek.

    int[] deck = new int[52];

    //Skapar två arrayer "suits" och "ranks" av typen Sträng och "hårdkodar" dessa med kortlekens färger resp värde.

    String[] suits = {"Spader", "Hjärter", "Klöver", "Ruter"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "Knekt", "Dam", "Kung"};


        
    // Arrayen  initialiseras med värden från 1-52 genom att använda arrayens längd.

    for (int i = 0; i < deck.length; i++)
      deck[i] = i;


    
    // Korten blandas.

    for (int i = 0; i < deck.length; i++) {

	/* För 52 kort skapas  genereras ett slumpmässigt index genom att skapa en variabel "index" av typen int och använda en Math-funktion som genererar en slumptal och multiplicerar detta med Arrayen "deck"s indexlängd. En variabel "temp" skapas där ett kort placeras. Det kortet får istället nummret från indexet vartefter indexkortet får värdet från variabeln "temp". */

      int index = (int)(Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index]; 
      deck[index] = temp;
    }



    // Ett värde tas från kommandoraden vilket ligger till grund för hur många givar skall delas ut genom att använda en for-loop.

    int N = Integer.parseInt(args[0]);
    for (int j =0; j < N; j++) {
    	

    
    //For-loopentt index genererar fem slumpmässiga kort från blandningen genom att  använda division och modulo för att få fram färg resp värde på ett slumpmässigt kort.

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
