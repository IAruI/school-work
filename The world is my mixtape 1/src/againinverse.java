import java.util.Scanner;
import java.util.Random;

public class againinverse {

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int randNum = 0;
    int upperLimit = 100;
    int lowerLimit = 1;
    String myAnswer = "";

    do {
        randNum = (upperLimit + lowerLimit + 1) / 2;
        System.out.println("I think it's " + randNum);
        myAnswer = in.nextLine();   

        if(myAnswer.equals("tl")) {  //too low
            lowerLimit = randNum + 1;
        } 
        else if(myAnswer.equals("th")) { // too high
            upperLimit = randNum - 1;
        }   
    }while(!myAnswer.equals("y"));

    in.close();
    System.out.println("YAAAY! :D");
}
}