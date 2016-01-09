import java.util.Scanner;

public class Arraysearch {
public static void main(String args[]){
	
	int array[] = new int[] {8,-3,4,0,-1,11,20,15,8,-15};
	Scanner userinput = new Scanner(System.in);
	System.out.println("add stuff");

	int number = userinput.nextInt();

	for(int i =0;i <= 9; i++){
		if(array[i] == number){
			System.out.println("It is at position" + i);
			
		}
	}
		
		boolean thing = true;
		int hold;
		
		while(thing == true){
	
			thing = false;
			for(int i =0; i < array.length-1; i++){
if (array[i]> array[i+1]){
	hold = array[i];
	array[i] = array[i+1];
	array[i+1] = hold;
	thing = true;
	
}
			}
		}
for(int i = 0; i <= 10; i++ )	{
	System.out.println(array[i]);
		
		
		
	}
	


}
}