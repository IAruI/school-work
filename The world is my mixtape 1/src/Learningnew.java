import java.util.Scanner;
public class Learningnew {
public static void main(String args[]){
	int[] letters = new int[27];
	
	for(int i =0; i <=26; i++){
		letters[i] =0;
	}
	Scanner userinput = new Scanner(System.in);
	String text = userinput.nextLine();
	
	for(int i =0; i<=text.length(); i++){
		System.out.println(text.charAt(i) + " " + (int)(text.charAt(i)-96));
		letters[(int)(text.charAt(i)-96)] =+ 1;

	}
	for(int i =0; i<=text.length(); i++){
		System.out.println((char)(letters[i]+96));
	}

	

	
	
}
}
