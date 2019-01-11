package eluer_project;

public class eluerQ4 {

	public static void main(String[] args) {

		int prod=1;

		int maxpalin = -1;

		for(int i=999;i>=100;i--) {
			for(int j=999;j>=100;j--) {
				prod=i*j;

				int temp=prod;

				if(isPalin(prod) && prod>maxpalin)
					maxpalin=temp;



			}
		}	
		System.out.println(maxpalin);

	}

	static boolean isPalin(int num) {
		int rev = 0;
		int d;
		int temp = num;
		while(num > 0) {
			d = num % 10;
			rev = rev*10 +d;
			num /= 10;
		}

		return temp==rev;
	}

}
