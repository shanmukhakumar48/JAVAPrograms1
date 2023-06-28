public class PrimeNumbFrom1TO100 {
	
	public static boolean gg(int n) {
		
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
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		if(gg(i)) {
			System.out.println(i+ " - Number is prime");
	}
		
	}

}
