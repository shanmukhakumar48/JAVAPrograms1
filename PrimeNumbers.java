import java.util.Scanner;

public class PrimeNumbers {

	public static boolean isprime(int n) {
		
		
	if(n<2) {
		return false;
	}
	for(int i=2;i<=n/2;i++) {
	 if(n%i==0) {
			return false;
			}
		}
		 
		return true;
		}
		 public static void main(String args[]) {

              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the number to check prime or not = ");
              int n=sc.nextInt();
			 if(isprime(n)) {
				 System.out.println("the number is prime");
			}
			 else {
			 System.out.println("not a prime number");
		 }
		 
		   }
	
//         public static boolean prime(int num) {
//        	 
//        	 if(num<2) {
//        		 return false;
//        	 }
//        	 
//        	 for(int i=2;i<=num/2;i++) {
//        		if(num%i==0) { 
//        		 
//        		return false;
//        		}
//        	 }
//        	 return true;
//        	 
//         }
//         public static void main(String[] args) {
//        	 
//       	 int num=1;
//        	 for(int i=0;i<=100;i++) {
//        		 
//			if(prime(i)) {
//				System.out.println(i);
//		    }
//		
//		}
  //}
}