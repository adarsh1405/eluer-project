package eluer_project;

public class eluerQ2 {

	public static void main(String[] args) {
	       int i = 1, t1 = 1, t2 = 2;
	      double total=0.0;

	        while (t1<=4000000)
	        {
	        	if(t1%2==0) {
	        		total=total+t1;
	            System.out.print(t1 + "  ");
	           
	        	}
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;

	            i++;
	        }
	        System.out.println(total + "  ");
}
	
}
