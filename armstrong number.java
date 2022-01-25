import java.util.Scanner;  
import java.lang.Math;  
class Tester {
	public static void main(String[] args) {
		int p = 407;
		int sum =0;
		int t = p;
		int digits = 0, a=0;
		while(t>0){
		    t= t/10;
		    digits++;
		}
		t = p;
		while(t>0){
		    a = t%10;
		    sum += (Math.pow(a, digits));
		    t =t/10;
		}
		if(sum == p){
		   System.out.println(p + " is an Armstrong number");
		}
		else{
		    System.out.println(p + " is not an Armstrong number");
		}
	
}
}
