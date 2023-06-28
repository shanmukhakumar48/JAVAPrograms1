import java.util.Scanner;

class mobile{
	public int mobile(int charge) {
		
//		if(charge<=30) {
//			System.out.println("mobile is off");
//		}
//		else if(charge>30) {
//			System.out.println("Mobile is on");
//		}
		
		String out=(charge<=30)?"Mobile is off":"Mobile is on";
		System.out.println(out);
		return 0;
	}
	
}


class book{
	
	public int book(int n) {
		
		String result=(n%2==0)?"even":"odd";
		System.out.println(result);
		
		return 0;
	}
}


class Calculator {
	
	public int add(int n1,int n2,int n3) {
		
		int sum=n1+n2+n3;
           
		System.out.println("sum is = "+sum);
	    return 7;

//	System.out.println("Hello");
//	return 0;
	}
}
public class ObjectCreating {

	public static void main(String[] args) {


//		int a=55;
//		int b=33;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the mobile charge = ");
		int charge =sc.nextInt();
		
		Calculator obj=new Calculator();
		obj.add(5,3,6);
		
		book ob=new book();
		ob.book(4);
		
		mobile o=new mobile();
		o.mobile(charge);
		
		
	}
}