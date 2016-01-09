import java.util.Scanner;
public class mixtapeislife {
	public static void main(String args[]){
Scanner userinput = new Scanner(System.in);
	String anything = userinput.nextLine();
	String anything2 = userinput.nextLine();
	int counter = 1;
	int total = 30 - (anything.length()+anything2.length());
	
		System.out.print(anything);
		
		while(counter<=total){
			System.out.print(".");
			counter++;
		}
System.out.print(anything2);
	}
	
	
	
	
}
