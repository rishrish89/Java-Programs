class Tester {
	public static void main(String[] args) {
	   int date =31;
	   int month =12;
	   int year = 15;
	   boolean even = false;
	   boolean odd = false;
	   if(date%2 == 0){
	       even = true;
	   }
	   else{
	       odd = true;
	   }
	   if(date <= 31 && even == true && month <= 7){
	       if(date == 30){
	           date = 1;
	           month++;
	       }
	       else if(date == 31){
	           System.out.println("Wrong date");
	       }
	       else{
	           date++;
	       }
	   }
	   else if(date <= 31 && odd == true && month <= 7){
	       if(date == 31){
	           date = 1;
	           month++;
	       }
	       else{
	           date++;
	       }
	   }
	   
	   else if(date <= 31 && even == true && month <= 12){
	       if(date == 31){
	           date = 1;
	           if(month < 12){
	               month++;
	           }
	           else if(month == 12){
	               month = 01;
	               year++;
	           }
	       }
	       else{
	           date++;
	       }
	   }
	   
	   else if(date <= 31 && odd == true && month <12){
	       if(date == 30){
	           date =1;
	           if(month < 12){
	               month++;
	           }
	       }
	       else if(date == 31){
	           System.out.println("Wrong date");
	       }
	       else{
	           date++;
	       }
	   }
	   
	   System.out.println(date +"-"+ month + "-20" + year);
	 
	
	    
	    
	    
	    
	    
	    
	    
	    
	}
}

