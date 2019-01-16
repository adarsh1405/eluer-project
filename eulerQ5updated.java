package eluer_project;

public class trail {
	public static int lcm(int x,int y) {
	int prod=1;
	 prod=x*y;
	while (y>0) {
		int rem=x%y;
		x=y;
		y=rem;
	}
	int lcm=prod/x;
	return lcm;
}
	public static void main(String[] args) {
		
		int res=1;
		
		for(int i=1;i<=20;i++) {
		 res=lcm(res,i);
		}
		System.out.println(res);
	}

}
