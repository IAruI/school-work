import java.util.Random;
import java.util.Scanner;
public class inverse {
public static void main(String args[]){
Scanner userinput = new Scanner(System.in);
Random number = new Random();

int low =1, high =1000, guesses =0;

boolean win = false;

while(!win)
{
	int guess = number.nextInt(high-low) + low;
	System.out.println("my guess is" + " " +guess);
	System.out.println("tl = Too low, th= too high, correct = correct");
	String feedback = userinput.nextLine();
	if(feedback.equals("tl") || feedback.equals("th") || feedback.equals("correct")   ){
		if (feedback.equals("tl")){
			low = guess;
			guesses++;
		}
		if ( feedback.equals("th")){
			
			high = guess;
			guesses++;

		}
			if (feedback.equals("correct")){
				System.out.println("its " + guess + "in "+guesses + "guesses");
				win = true;
			}
		
		
	}
}





	
}
}
