package eluer_project;

public class eluerQ5 {

	public static void main(String[] args) {
	
		for(int a=1;;a++) {
			int count=0;
		for(int i=1;i<=20;i++) {
			if(a%i==0) {
				count++;
			}
			if(count==20) {
				System.out.println(a);
			}
		} }

	}

}
