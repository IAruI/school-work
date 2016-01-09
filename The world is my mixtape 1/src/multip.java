import java.util.Scanner;

public class multip {
	public static void main(String args[]) {

		System.out.println("*|  1  2  3  4  5  6  7  8  9 ");
		System.out.println("-----------------------------");
		for (int counter = 1; counter <= 9; counter++) {
			System.out.println(" ");
			System.out.print(counter + "|");

			for (int counter2 = 1; counter2 <= 9; counter2++) {

				if ((counter * counter2) < 10) {
					System.out.print(" " + " " + counter * counter2);
				} else {
					System.out.print(" " + counter * counter2);
				}
			}
		}

	}
}
