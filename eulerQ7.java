package eluer_project;

public class eluerQ7 {

	public static void main(String[] args) {
		  
		
		int c=0;
		for(double num=1;num<300000;num++) {
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				c++;		
			
		if(c==10001) {
			System.out.println(num);
				
			}
		}	}
		
		System.out.println(c);
	}
	
}
