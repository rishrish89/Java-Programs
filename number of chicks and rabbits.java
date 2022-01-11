class Tester {
	public static void main(String[] args) {
	  int heads = 5;
	  int legs = 10;
	  int rabbit = 0 ;
	  int chickens = 0;
	  if(legs%2!=0 || heads == 0){
	      System.out.println("The number of chickens and rabbits cannot be found");
	      
	  }
	  else{
	      rabbit = (legs - 2 * heads) / 2;
	      chickens = heads - rabbit;
	  
	      
	  System.out.println("chickens = " + chickens + " rabbits = " + rabbit);
	  }
	}
}
