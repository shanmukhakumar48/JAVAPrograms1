import java.util.Scanner;

class mobile{
public String charge(int charging) {

if(charging<=30)
return "no charge";
else
return "battery condition is good";
  }
}

class pen {
   public int cost(int cost) {

if(cost<=7) {
System.out.println("No pen Available in this cost");
}
else if(cost<=50) {
System.out.println("Pen is available");
}
else if(cost>=50) {
System.out.println("Pen is not available in this cost of above inr 50");
}
return 0;
}
}
public class methods {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pen cost = ");
		int cost=sc.nextInt();
		    pen fk=new pen();
		fk.cost(cost);

		System.out.println("Enter the mobile charge = ");
		int charging=sc.nextInt();

		mobile mb=new mobile();
		String str=mb.charge(charging);
		System.out.println(str);

		}

}

