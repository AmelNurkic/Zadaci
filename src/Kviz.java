import java.util.*;

public class Kviz {

	public static void main(String[] args) {
		sabiranje();
		oduzimanje();
		mnozenje();
		dijeljenje();
		korjenovanje();
		kvadriranje();

	}

	public static boolean prirodniBroj(double d) {
		return (d == Math.floor(d)) && !Double.isInfinite(d);
	}

	public static void sabiranje() {
		try {
			Scanner input = new Scanner(System.in);
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			System.out.println("Koliko je " + a + " + " + b + "?");
			int c = input.nextInt();
			int d = a + b;
			if (c == d) {
				System.out.println("Bravo pogodili ste!");
			} else
				System.out.println("Netacno.");
		} catch (Exception e) {
			System.out.println("Pogresan unos!");
		}
	}

	public static void oduzimanje() {
		try {
			Scanner input = new Scanner(System.in);
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			System.out.println("Koliko je " + a + " - " + b + "?");
			int c = input.nextInt();
			double d = a - b;
			if (c == d) {
				System.out.println("Bravo pogodili ste!");
			} else
				System.out.println("Netacno.");
		} catch (Exception e) {
			System.out.println("Pogresan unos!");
		}
	}

	public static void mnozenje() {
		try {
			Scanner input = new Scanner(System.in);
			int a = (int) (Math.random() * 10);
			int b = (int) (Math.random() * 10);
			System.out.println("Koliko je " + a + " * " + b + "?");
			int c = input.nextInt();
			double d = a * b;
			if (c == d) {
				System.out.println("Bravo pogodili ste!");
			} else
				System.out.println("Netacno.");
		} catch (Exception e) {
			System.out.println("Pogresan unos!");
		}
	}

	public static void dijeljenje() {
		try {
			Scanner input = new Scanner(System.in);
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 10);
			while (a % b != 0 || a == 0 || b == 0) {
				a = (int) (Math.random() * 100);
				b = (int) (Math.random() * 10);
			}
			System.out.println("Koliko je " + a + " / " + b + "?");
			int c = input.nextInt();
			double d = a / b;
			if (c == d) {
				System.out.println("Bravo pogodili ste!");
			} else
				System.out.println("Netacno.");
		} catch (Exception e) {
			System.out.println("Pogresan unos!");
		}
	}

	public static void korjenovanje() {
		try {
			Scanner input = new Scanner(System.in);
			int a = (int) (Math.random() * 300);
			while (a != 0 || !prirodniBroj(Math.sqrt(a))) {
				a = (int) (Math.random() * 100);
			}
			int b = (int) Math.sqrt(a);
			System.out.println("Koliko je korijen od broja " + a + "?");
			int c = input.nextInt();
			if (c == b) {
				System.out.println("Bravo pogodili ste!");
			} else
				System.out.println("Netacno.");
		} catch (Exception e) {
			System.out.println("Pogresan unos!");
		}
	}

	public static void kvadriranje() {
		try {
			Scanner input = new Scanner(System.in);
			int a = (int) (Math.random() * 20);
			int b = a * a;
			System.out.println("Koliko je " + a + " na kvadrat?");
			int c = input.nextInt();
			if (c == b) {
				System.out.println("Bravo pogodili ste!");
			} else
				System.out.println("Netacno.");
		} catch (Exception e) {
			System.out.println("Pogresan unos!");
		}
	}
}
