package eluer_project;

public class eluerQ10 {

	public static void main(String[] args) {
	
		double sum=0;
		for(double num=1;num<=2000000;num++) {
			int count=0;
			for(double j=1;j<=num;j++) {
				if(num%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(num);
				sum=sum+num;
		}
	}
		System.out.println("sum="+ sum);

}	}
