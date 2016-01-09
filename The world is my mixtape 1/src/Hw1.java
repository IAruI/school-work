

	//import Scanner
	import java.util.Scanner;

	public class Hw1 {

		public static void main(String[] args) {
			
			//inp
			Scanner inp = new Scanner (System.in);
			
			
			
			String userString;
			
			
			//Declare Array (of alphabetReccur)
			char[] stringToCharArray;
			
			
			int[] alphabetReccur;
			
			
			//26 elements
			alphabetReccur = new int[26];
			
			//Prompt for entering of string
			System.out.print("Please enter your string: ");
			
			
						userString = inp.nextLine();
			System.out.println();
			
			
			
			//string to char
			stringToCharArray = userString.toCharArray();
			
			//for to sort all chars in the array
			for(int i=0 ; i < stringToCharArray.length ; i++){
				
				if(stringToCharArray[i] == 'a'|| stringToCharArray[i] == 'A'){
					alphabetReccur[0] = alphabetReccur[0] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'b'|| stringToCharArray[i] == 'B'){
					alphabetReccur[1] = alphabetReccur[1] + 1;
				}//b or B
				
				if(stringToCharArray[i] == 'c'|| stringToCharArray[i] == 'C'){
					alphabetReccur[2] = alphabetReccur[2] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'd'|| stringToCharArray[i] == 'D'){
					alphabetReccur[3] = alphabetReccur[3] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'e'|| stringToCharArray[i] == 'E'){
					alphabetReccur[4] = alphabetReccur[4] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'f'|| stringToCharArray[i] == 'F'){
					alphabetReccur[5] = alphabetReccur[5] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'g'|| stringToCharArray[i] == 'G'){
					alphabetReccur[6] = alphabetReccur[6] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'h'|| stringToCharArray[i] == 'H'){
					alphabetReccur[7] = alphabetReccur[7] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'i'|| stringToCharArray[i] == 'I'){
					alphabetReccur[8] = alphabetReccur[8] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'j'|| stringToCharArray[i] == 'J'){
					alphabetReccur[9] = alphabetReccur[9] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'k'|| stringToCharArray[i] == 'K'){
					alphabetReccur[10] = alphabetReccur[10] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'l'|| stringToCharArray[i] == 'L'){
					alphabetReccur[11] = alphabetReccur[11] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'm'|| stringToCharArray[i] == 'M'){
					alphabetReccur[12] = alphabetReccur[12] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'n'|| stringToCharArray[i] == 'N'){
					alphabetReccur[13] = alphabetReccur[13] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'o'|| stringToCharArray[i] == 'O'){
					alphabetReccur[14] = alphabetReccur[14] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'p'|| stringToCharArray[i] == 'P'){
					alphabetReccur[15] = alphabetReccur[15] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'q'|| stringToCharArray[i] == 'Q'){
					alphabetReccur[16] = alphabetReccur[16] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'r'|| stringToCharArray[i] == 'R'){
					alphabetReccur[17] = alphabetReccur[17] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 's'|| stringToCharArray[i] == 'S'){
					alphabetReccur[18] = alphabetReccur[18] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 't'|| stringToCharArray[i] == 'T'){
					alphabetReccur[19] = alphabetReccur[19] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'u'|| stringToCharArray[i] == 'U'){
					alphabetReccur[20] = alphabetReccur[20] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'v'|| stringToCharArray[i] == 'V'){
					alphabetReccur[21] = alphabetReccur[21] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'w'|| stringToCharArray[i] == 'W'){
					alphabetReccur[22] = alphabetReccur[22] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'x'|| stringToCharArray[i] == 'X'){
					alphabetReccur[23] = alphabetReccur[23] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'y'|| stringToCharArray[i] == 'Y'){
					alphabetReccur[24] = alphabetReccur[24] + 1;
				}//a or A
				
				if(stringToCharArray[i] == 'z'|| stringToCharArray[i] == 'Z'){
					alphabetReccur[25] = alphabetReccur[25] + 1;
				}//a or A
					
			}//for loop
			
			System.out.println("Letter\tReccurences");
			System.out.println("a\t" + alphabetReccur[0]);
			System.out.println("b\t" + alphabetReccur[1]);
			System.out.println("c\t" + alphabetReccur[2]);
			System.out.println("d\t" + alphabetReccur[3]);
			System.out.println("e\t" + alphabetReccur[4]);
			System.out.println("a\t" + alphabetReccur[5]);
			System.out.println("g\t" + alphabetReccur[6]);
			System.out.println("h\t" + alphabetReccur[7]);
			System.out.println("i\t" + alphabetReccur[8]);
			System.out.println("j\t" + alphabetReccur[9]);
			System.out.println("k\t" + alphabetReccur[10]);
			System.out.println("l\t" + alphabetReccur[11]);
			System.out.println("m\t" + alphabetReccur[12]);
			System.out.println("n\t" + alphabetReccur[13]);
			System.out.println("o\t" + alphabetReccur[14]);
			System.out.println("p\t" + alphabetReccur[15]);
			System.out.println("q\t" + alphabetReccur[16]);
			System.out.println("r\t" + alphabetReccur[17]);
			System.out.println("s\t" + alphabetReccur[18]);
			System.out.println("t\t" + alphabetReccur[19]);
			System.out.println("u\t" + alphabetReccur[20]);
			System.out.println("v\t" + alphabetReccur[21]);
			System.out.println("w\t" + alphabetReccur[22]);
			System.out.println("x\t" + alphabetReccur[23]);
			System.out.println("y\t" + alphabetReccur[24]);
			System.out.println("z\t" + alphabetReccur[25]);
		}//main
	}//DuplicateLetterFinder

