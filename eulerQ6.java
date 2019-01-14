package eluer_project;

public class eluerQ6 {

	public static void main(String[] args) {
	
		int sum=0;
		int prod=0;
		for(int i=1;i<=100;i++) {
		sum=sum+i;
		prod=prod + (i*i);
	}
		sum=sum*sum;
		int diff=sum-prod;
		System.out.println(diff);
	}

}
