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
    Scanner sacanner = new Scanner(System.in);
		int hi = sacanner.nextInt();
		int mi = sacanner.nextInt();
		int hf = sacanner.nextInt();
		int mf = sacanner.nextInt();
		int h = hf - hi;
		int m = mf - mi;
		if (h > 0 && m > 0) {
			if (((h * 60) + (m)) >= 1 && (((h) * 60) + (m)) <= 1440) {
				System.out.println("O JOGO DUROU " + (h) + " HORA(S)" + " E " + (m) + " MINUTO(S)");
			}
		} else if (h > 0 && m < 0) {
			m += 60;
			h-=1;
			if ((((h) * (60)) + (m)) >= 1 && (((h) * 60) + (m)) <= 1440) {
				System.out.println("O JOGO DUROU " + (h) + " HORA(S)" + " E " + (m) + " MINUTO(S)");
			}
		} else if (h > 0 && m == 0) {
			if ((((h) * (60)) + (m)) >= 1 && (((h) * 60) + (m)) <= 1440) {
				System.out.println("O JOGO DUROU " + (h) + " HORA(S)" + " E " + (m) + " MINUTO(S)");
			}
		} else if (h < 0 && m > 0) {
			h += 23;
			if (((h * 60) + m) >= 1 && ((h * 60) + (m)) <= 1440) {
				System.out.println("O JOGO DUROU " + (h) + " HORA(S)" + " E " + (m) + " MINUTO(S)");
			}
		} else if (h < 0 && m < 0) {
			h += 23;
			m += 60;
			if (((h * 60) + m) >= 1 && ((h * 60) + (m)) <= 1440) {
				System.out.println("O JOGO DUROU " + (h) + " HORA(S)" + " E " + (m) + " MINUTO(S)");
			}
		} else if (h < 0 && m == 0) {
			h += 23;
			if (((h * 60) + m) >= 1 && ((h * 60) + (m)) <= 1440) {
				System.out.println("O JOGO DUROU " + (h) + " HORA(S)" + " E " + (m) + " MINUTO(S)");
			}
		} else if (h == 0 && m > 0) {
			if (((h * 60) + m) >= 1 && ((h * 60) + (m)) <= 1440) {
				System.out.println("O JOGO DUROU " + (h) + " HORA(S)" + " E " + (m) + " MINUTO(S)");
			}
		} else if (h == 0 && m < 0) {
			m += 60;
			if (((h * 60) + m) >= 1 && ((h * 60) + (m)) <= 1440) {
				System.out.println("O JOGO DUROU " + (h) + " HORA(S)" + " E " + (m) + " MINUTO(S)");
			}
		} else if (h == 0 && m == 0) {
			h += 24;
			if (((h * 60) + m) >= 1 && ((h * 60) + (m)) <= 1440) {
				System.out.println("O JOGO DUROU " + (h) + " HORA(S)" + " E " + (m) + " MINUTO(S)");
			}	
		}
 
    }
 
}
