import java.util.Scanner;
public class sumandaverage {
public static void main(String args[]){
	Scanner userinput = new Scanner(System.in);
int uppderbound = userinput.nextInt();
int sum=0;
int average=0;
for(int counter =0; counter<=uppderbound; counter++){
	sum=sum+counter;
	
}

System.out.println(sum);
average = sum/uppderbound;
System.out.println(average);


}
}
