class Tester {
	public static void main(String[] args) {
	     int x = 5; // x represents $5 note
	     int y = 1; // x represents $1 note
	     int numberOf5$notes =5;
	     int numberOf1$notes = 3;
	     int cost = 27;
	     int pop = cost / x; // 4
	     int cop = cost % x; // 1
	     
	     if (pop <= numberOf5$notes && cop <= numberOf1$notes)
	     {
	         System.out.println(" $1 note needed = " + cop +" , $5 note needed = " + pop );
	     }
	     else{
	         System.out.println(-1);
	     }
	}
}
//OUTPUT--  " $1 note needed = 2 , $5 note needed = 5 " 
