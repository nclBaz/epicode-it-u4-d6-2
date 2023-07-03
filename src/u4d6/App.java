package u4d6;

import java.util.Scanner;

import u4d6.exceptions.InvalidNameException;
import u4d6.exceptions.NumberLessThanZeroException;

public class App {
	public static void main(String[] args) {

		// ****************** EXCEPTION EXAMPLES *******************

//		int[] numbers = { 1, 2, 3, 4, 5 };
		// System.out.println(numbers[5]); // <-- UNCHECKED
		// (ArrayIndexOutOfBoundsException)

//		String s1 = "asda";
//		s1 = null;
//		s1.toUpperCase(); // <-- UNCHECKED (NullPointerException)
		// s1.charAt(10);

//		int a = 2;
//		int b = 0;
//		int result = a / b; // <-- UNCHECKED (ArithmeticException)
//		System.out.println(result);

		try {
			int a = 2;
			int b = 1;
			int result = a / b; // <-- UNCHECKED (ArithmeticException)
			System.out.println(result);

			String s1 = "asda";
//			s1 = null;
			s1.toUpperCase();

			int[] numbers = { 1, 2, 3, 4, 5 };
			System.out.println(numbers[5]);

		} catch (ArithmeticException e) {
			System.out.println("Problema di tipo aritmetico");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Problema di tipo null pointer");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Problema generico");
			e.printStackTrace();
		}

		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Dammi il primo numero");
			int a = Integer.parseInt(input.nextLine());
			System.out.println("Dammi il secondo numero");
			int b = Integer.parseInt(input.nextLine());

			System.out.println(a + b);
		} catch (NumberFormatException e) {
			System.out.println("No bueno");
		} finally {
			input.close();
		}

//		sum();
//
		try {
			print("Ciao");

		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		// print("");
	}

	public static void print(String str) throws InvalidNameException {
		if (str.length() == 0)
			throw new InvalidNameException("La stringa inserita non è valida");

		// print(str);
		System.out.println(str);
	}

	public static int sum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Dammi il primo numero");
		int a = Integer.parseInt(input.nextLine());

		if (a < 0)
			throw new NumberLessThanZeroException(a);

		System.out.println("Dammi il secondo numero");
		int b = Integer.parseInt(input.nextLine());
		if (b < 0)
			throw new NumberLessThanZeroException(b);


		input.close();
		return a + b;
	}
}
