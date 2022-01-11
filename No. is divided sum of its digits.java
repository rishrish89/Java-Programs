class Tester {
	public static void main(String[] args) {
		int ip = 123;
		int inp = ip;
		int pop =0;
		while(inp>0){
		    pop = pop + inp%10;
		    inp = inp/10;
		}
		
		if(ip%pop ==0){
		    System.out.println(ip + " is divisible by sum of its digits");
		}
		else{
		    System.out.println(ip + " is not divisible by sum of its digits");
		}
	}
}
