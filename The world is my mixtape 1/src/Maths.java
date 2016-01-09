
public class Maths {
public static void main(String args[]){
	double lowest =100;
	double perfect1 = 0;
	double perfect2=0;
	double start = 55;
	double perfectlength=0;

	for (int i =0; i<=10000; i++){
		double startminus= 75.0-start;
		double time1;
		double legnth1;
		double length2;
	
		legnth1= (double) Math.sqrt(start*start + 4); 
		length2= (double) Math.sqrt(startminus*startminus + 625); 
		legnth1 = legnth1/2;
double time;

time = legnth1 + length2;
if(time < lowest){
	lowest=time;
	perfect1 = legnth1;
	perfect2 = length2;
	 perfectlength = startminus;
}
start = start+ 0.001;

	}
	System.out.println(lowest + " " +perfect1*2 + " " +perfectlength);
	
}
}
