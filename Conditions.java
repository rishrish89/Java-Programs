class Tester {
	public static void main(String[] args) {
		int inp = 2;
	    if(inp % 3 ==0 && inp % 5 == 0){
	        System.out.println("Zoom");
	    }
	    else if(inp % 5 == 0){
	        System.out.println("Zap");
	    }
	    else if( inp % 3 ==0 ){
	         System.out.println("Zip");
	    }
	    else{
	        System.out.println("Invalid");
	    }
	}
}
