import java.io.IOException;
import java.math.BigInteger;
import java.util.*; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner sacanner =  new Scanner(System.in);
	int teste = sacanner.nextInt();
	for(int i = 1; i<=teste; i++) {
	int a =  sacanner.nextInt();
	int b = sacanner.nextInt();
	 BigInteger b1 =  BigInteger.valueOf(a);
	    BigInteger b2 = BigInteger.valueOf(b);
	    BigInteger gcd = b1.gcd(b2);
	    System.out.println(gcd);

}
 
    }
 
}
