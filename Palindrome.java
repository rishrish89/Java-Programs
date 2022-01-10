class Tester {
	public static void main(String[] args) {
	long inp = 123456654321L;
    long ip = inp;
    long pop = 0L;
		while(ip > (long)0){
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
