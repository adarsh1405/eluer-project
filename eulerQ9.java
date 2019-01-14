package eluer_project;

public class eluerQ9 {

	public static void main(String[] args) {
		
		double prod=1;
		for(int a=1;a<=1000;a++) {
			for(int b=a+1;b<=1000;b++ ) {
				double c=Math.sqrt(a*a+b*b);
				if((a+b+c)==1000) {
					 prod=a*b*c;
				}
			}
		}
		System.out.println(prod);
	}

}
