
public class Vinkel{

    public static void main(String[] args){

	double vinkel=Double.parseDouble(args[0]);

	double vinkel_rad=Math.toRadians(vinkel);

	System.out.print(Math.sin(vinkel_rad) * Math.sin(vinkel_rad) + Math.cos(vinkel_rad) * Math.cos(vinkel_rad));
    }
}