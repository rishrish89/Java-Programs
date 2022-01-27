import java.util.*;
class Tester {
	public static void main(String[] args) {
		// Implement your code here
		String s = "1623";
		int p = s.length();
		int a =0;
		int sum =0;
		for(int i =0;i<p;i++){
		    if(i%2 !=0){
		        a = s.charAt(i) - '0';
		        sum = sum +a*a;
		    }
		    
		    
		    
		}
		if(sum % 9 == 0){
		    System.out.println(sum + " is a lucky no.");
		}
		else 
		    System.out.println(sum + " is not a lucky no.");
		
		
		
	}
