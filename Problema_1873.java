import java.io.IOException;
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

	
	   int n = sacanner.nextInt();
	   String x[] = new String[2];
	  
	    for(int i = 1; i<=n; i++) {
	        x[0] = sacanner.next();
	        x[1] = sacanner.next(); 
	        String raj = x[0];
	        String sheldon = x[1];
	  
	        if (raj.contentEquals("tesoura") && sheldon.contentEquals("papel")){
	            System.out.println("rajesh");
	        }
	        else if( raj.contentEquals("papel") && sheldon.contentEquals("pedra")) {
	            System.out.println("rajesh");
	        }
	        else if( raj.contentEquals("pedra") && sheldon.contentEquals("lagarto")) {
	            System.out.println("rajesh");
	        }
	        else if( raj.contentEquals("lagarto") && sheldon.contentEquals("spock")) {
	            System.out.println("rajesh");
	        }
	        else if( raj.contentEquals("spock") && sheldon.contentEquals("tesoura")) {
	            System.out.println("rajesh");
	        }
	        else if( raj.contentEquals("tesoura") && sheldon.contentEquals("lagarto")) {
	           System.out.println("rajesh");
	        }
	        else if( raj.contentEquals("lagarto") && sheldon.contentEquals("papel")) {
	            System.out.println("rajesh");
	        }
	        else if( raj.contentEquals("papel") && sheldon.contentEquals("spock")) {
	            System.out.println("rajesh");
	        }
	        else if( raj.contentEquals("spock") && sheldon.contentEquals("pedra")) {
	            System.out.println("rajesh");
	        }
	        else if( raj.contentEquals("pedra") && sheldon.contentEquals("tesoura")) {
	            System.out.println("rajesh");
	        }
	            else if( raj.contentEquals(sheldon)){
	            System.out.println("empate");
	            }
	        else {
	            System.out.println("sheldon");
	        }
	    }
    }
 
}
