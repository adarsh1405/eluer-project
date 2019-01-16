package eluer_project;

public class eulerQ7new {

	public static void main(String[] args) {
		int numprime = 1;
		int num = 1;
		 
		while (numprime < 10001) {
		    num = num + 2;
		    if (isPrime(num)) {
		        numprime++;
		    }
		}
		System.out.println(num);
		
	}
		public static boolean isPrime(int num) {
		    
		 
		 
		    if (num % 2 == 0) {
		        return false;
		    }
		 
		    int count = 3;
		 
		    while ((count * count) <= num) {
		        if (num % count == 0) {
		            return false;
		        } else 
		            count +=2;
		        
		    }
		 
		    return true;
		}
		
		
	}


