import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    int len = 0;
    int wid = 0;

    Scanner input = new Scanner(System.in);


    while (len == 0) {
        System.out.print("Enter the length: ");
        len = input.nextInt();
        System.out.print("Enter the Width: ");
        wid = input.nextInt();

        for (int w = 0; w < len; w++) {
            for (int l = 0; l < wid; l++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
}