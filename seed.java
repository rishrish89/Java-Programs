class Tester {
	public static void main(String[] args) {
	  int x = 45;
	  int y  = 1000;
      int pop = x;
	  int ip = x;
	  while(ip>0){
	       pop = (pop * (ip%10));
	       ip = ip/10;
	  }
	  if(pop == y){
	      System.out.println(x + " is a seed of " + y);
	  }
	  else{
	      System.out.println(x + " is not a seed of " + y);
	  }
	}
}
