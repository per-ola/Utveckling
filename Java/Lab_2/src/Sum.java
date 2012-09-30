public class Sum {
public static void main(String[] cmdLn) {
int n = Integer.parseInt(cmdLn[0]);
int sum = 0;
for (int i = 0; i < n; i++){
sum = sum + StdIn.readInt() ;
}
System.out.println("Sum is " + sum);
}
}
