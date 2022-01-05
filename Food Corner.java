class Tester {
	public static void main(String[] args) {
		char order = 'N';
		int distance = 7;
		int qua = 2;
		if(distance <= 3){
		    if(order == 'N'){
		        int cost = ( 15 * qua) + 0;
		        System.out.println(cost);
		    }
		    if(order == 'V'){
		        int cost = ( 12 * qua) + 0;
		        System.out.println(cost);
		    }
		}
		else if(distance > 3 && distance <= 6){
		    if(order == 'N'){
		        int cost = ( 15 * qua) + 1;
		        System.out.println(cost);
		    }
		    if(order == 'V'){
		        int cost = ( 12 * qua) + 1;
		        System.out.println(cost);
		    }
		}
		else if(distance > 6 ){
		    if(order == 'N'){
		        int cost = ( 15 * qua) + 2;
		        System.out.println(cost);
		    }
		    if(order == 'V'){
		        int cost = ( 12 * qua) + 2;
		        System.out.println(cost);
		    }
		}
	}
}
