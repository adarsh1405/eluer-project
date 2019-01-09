package eluer_project;

public class eluerQ3 {

	public static void main(String[] args) {
	double n=600851475143.0;
		double temp=n;
		double lprime;
		 for(int i = 2; i<n ; i++) {
	         while(n%i == 0) {
	            System.out.println(i+" ");
	            n = n/i;
	         }
	      }
	      if(n >2) {
	         System.out.println(n);
	         lprime=n;
	         System.out.println("largest prime no = "+ lprime);
	         
	      }
	}

}
