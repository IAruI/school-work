import java.util.Scanner;
import java.util.Random;

public class Mixtape1 {
public static void main(String args[]){
	
    Random randomGenerator = new Random();

    int  n = randomGenerator.nextInt(1000) + 1;
	  Scanner swag = new Scanner(System.in);

    
for(int counter=0; counter<10; counter++){

    System.out.println("Choose to 1000");
 int randomint = swag.nextInt();
 
 while (randomint >1000 | randomint <0){
	    System.out.println("Do it again");
	    randomint = swag.nextInt();

 }

 
 if(randomint > n){
	 System.out.println("You are too high");
 }else if(randomint < n){
	 System.out.println("You are too low");
 }else{
	 System.out.println("You win");
 }
 
 if(randomint != n){
	 System.out.println("You need to keep guessing.");
	 
 }else{
	 System.out.println("You did it in" + counter + "times");
	 counter = 9;
 }
 
if(counter== 9){
	 System.out.println("You are out of terms");
 }
}
System.out.println("Number is"+" " + n);


}
}

	


		
		
	

