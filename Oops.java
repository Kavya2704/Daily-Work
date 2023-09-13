package launch;

import java.util.Scanner;


abstract class Bank{
	
	float SI;
	float r;
	
	abstract void acceptInput();
	
	abstract void calc();
	void display() {
		System.out.println("Simple Interest is: "+SI);
	}
	
	
}

class Customer1 extends Bank{
	private float p;
	private int t;
	void acceptInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Principle:");
		p=s.nextFloat();
		System.out.println("Enter the time:");
		t=s.nextInt();
		r=2.5f;
	}
	
	
	void calc() {
		SI=(p*t*r)/100;
	}
	
}

class Customer2 extends Bank{
	private float p;
	private int t;
	void acceptInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Principle:");
		p=s.nextFloat();
		System.out.println("Enter the time:");
		t=s.nextInt();
		r=2.5f;
	}
	
	void calc() {
		SI=(p*t*r)/100;
	}
	
}

class Loan{
	void permit(Bank ref) {
		ref.acceptInput();
		ref.calc();
		ref.display();
	}
}


/*class Customer1{
	float p;
	int t;
	float SI;
	float r;
	
	void acceptInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Principle:");
		p=s.nextFloat();
		System.out.println("Enter the time:");
		t=s.nextInt();
		r=2.5f;
	}
	void calc() {
		SI=(p*t*r)/100;
	}
	
	void display() {
		System.out.println("Simple Interest is: "+SI);
	}
}
*/
public class Oops {

	public static void main(String[] args) {
		Customer1 c1=new Customer1();
		Customer2 c2=new Customer2();
		
		Loan l=new Loan();
		
		l.permit(c1);
		l.permit(c2);
		
		
		
		
		
		/*Customer1 c=new Customer1();
		c.acceptInput();
		c.calc();
		c.display();
		*/

	}

}
