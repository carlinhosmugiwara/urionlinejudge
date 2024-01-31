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
      do {
      int v =  sacanner.nextInt();
      int t =  sacanner.nextInt();
      System.out.println(2*v*t);
      } while(sacanner.hasNext());
       
        }
 
}
