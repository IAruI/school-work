import java.util.Scanner;
public class Main2 {
public static void main(String args[]){
	
	  int len = 0;
	    int wid = 0;

	System.out.println("**********");
	System.out.println("how many stars max 100 and min 0");
	Scanner userinput = new Scanner(System.in);
	
	int number = userinput.nextInt();
while(number >100 || number <0){
	number = userinput.nextInt();

}
		
	for(int counter=0; counter <number; counter++){
		System.out.print("*");
	}
	
	
	System.out.println("");
	System.out.println("****");
	System.out.println("****");
	System.out.println("****");
	System.out.println("****");
	
	
	        System.out.print("Enter the length: ");
	        len = userinput.nextInt();
	        System.out.print("Enter the Width: ");
	        wid = userinput.nextInt();

	        for (int w = 0; w < wid; w++) {
	            for (int l = 0; l < len; l++) {
	                System.out.print(" *");
	            }
	            System.out.println("");
	        }
	    }
}

