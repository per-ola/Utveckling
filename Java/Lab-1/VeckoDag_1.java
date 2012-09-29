/*Progammet läser in dag, månad och år från kommandoraden och ger tillbaka veckodag i form av siffror 0-6 för söndag till lördag*/

public class VeckoDag_1 {

    public static void main(String[] args) { 
	
	//Läser in variabler. Jag har valt ordningen: dag, månad, år.
	
        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

		//Färdig formel för uträkning av veckodag i form av: 0-6 för sön-lör.
		
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

		//Skriver resultat till konsolen.
		
        System.out.println(d0);
    }

}


