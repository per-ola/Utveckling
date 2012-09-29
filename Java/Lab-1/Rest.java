public class Rest{

    public static void main(String [] cmdLn){

	int a = Integer.parseInt(cmdLn[0]);

	int b = Integer.parseInt(cmdLn[1]);

	int c = a%b;

	if (c==0){

	    System.out.print("true");
	}

    }

}