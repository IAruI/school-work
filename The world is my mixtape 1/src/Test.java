import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner swag1 = new Scanner(System.in);
		String[] swag = new String[10];
		String mixtape;
		for (int i = 0; i <= 9; i++) {
			mixtape = swag1.nextLine();
			swag[i] = mixtape;

		}
		for (int i = 9; i >= 0;i--) {
			System.out.println(swag[i]);

		}

	}
}