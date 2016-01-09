import java.util.Scanner;
public class binary {
public static void main(String args[]){
	Scanner userinput = new Scanner(System.in);
	int user = userinput.nextInt();
	int array[] = new int[30];
			
do{
	int counter =0;
int number = user%2;
int number2 = user/2;
array[counter] = number;

if(number < 2){
	array[counter] = number;
}
	
	
	counter++;
} while(user%2 < 2);

for(int counter = 0; counter <= array.length; counter++){
	System.out.println(array[counter]);
}



}
}
