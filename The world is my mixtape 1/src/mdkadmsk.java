import java.util.Scanner;
public class mdkadmsk {
	public static void main(String args[]){
	Scanner userinput = new Scanner(System.in);
	String anything = userinput.nextLine();
	
	int total= anything.length();
	
	int counter = 1;
	while(counter <= total){
		System.out.println(anything);
		counter++;
	}
}
}