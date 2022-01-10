class Tester {
	public static void main(String[] args) {
		int inp = 1332;
		int ip = inp;
		int pop = 0;
		while(ip > 0){
		     pop = pop *10+ ip % 10;
		     ip = ip /10;
		     }
		     
		     
		if(pop == inp){
		    System.out.println(inp + " is a Palindrome");
		}
		else{
		    System.out.println(inp + " is not a Palindrome");
		}
	}
}
