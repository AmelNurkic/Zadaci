/**
 * Napisati jednostavnu math quiz aplikaciju. Aplikacija treba da generiše
 * random matematièka pitanja iz oblasti: a. Sabiranja b. Oduzimanja c. Množenja
 * d. Djeljenja e. Korjenovanja f. Kvadriranja Koristiti github kao issue
 * tracking / to-do alat te commitati sav rad na aplikaciji koristeæi feature
 * branch workflow.
 */
import java.util.*;
public class Kviz {

	public static void sabiranje(double a, double b) {
		Scanner input = new Scanner(System.in);
		a = Math.random() * 100;
		b = Math.random() * 100;
		double c = input.nextDouble();
		double d = a + b;
		if (c == d) {
			System.out.println("Bravo pogodili ste!");
		} else
			System.out.println("Netacno.");
		input.close();
	}

	public static void oduzimanje(double a, double b) {
	}

	public static void mnozenje(double a, double b) {
	}

	public static void dijeljenje(double a, double b) {
	}

	public static void korjenovanje(double a) {
	}

	public static void kvadriranje(double a) {
	}
}
