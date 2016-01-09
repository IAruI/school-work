

	import java.util.Scanner;
	public class hw2 {

		public static void main(String[] args) {
			
			
			//user input
			Scanner userInput = new Scanner (System.in);
			
			
			//declare Stringinput
			String Stringinput;
			//Declare counter for spaces (spaceCount)
			int spaceCount = 0;
			//Declare array (of Stringinput)
			char[] stringToCharArray;
			
			//Ask for sentence
			System.out.print("Please enter your sentence");
			Stringinput = userInput.nextLine();
			System.out.println();
			
			
			
			
			//convert Stringinput to array
		
			stringToCharArray = Stringinput.toCharArray();
			
			//close userInput
			userInput.close();
			
			for (int i = 0 ; i < stringToCharArray.length ; i++) {
				
				if(stringToCharArray[i] == ' '){
					spaceCount++;
				}
				
			}
			
			//Display amount of words
			System.out.println("There are " + (spaceCount + 1) + " spaces in your sentence");
			
		}
	}


