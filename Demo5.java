package create;

class Washroom extends Thread
{
	@Override
	  public void run() {
		try
		{
			System.out.println(Thread.currentThread().getName()+ "has entered the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+ "is using the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+ "has exited the bathroom");
		}
		catch(Exception e)
		{
			System.out.println("Problem");
		}
	}
}


public class Demo5 {

	public static void main(String[] args) {
		 Washroom ba=new Washroom();
		 
		 Thread t1=new Thread(ba);
		 Thread t2=new Thread(ba);
		 Thread t3=new Thread(ba);
		 
		 t1.setName("BOY");
		 t2.setName("GIRL");
		 t3.setName("OTHERS");
		 
		 t1.start();
		 t2.start();
		 t3.start();

	}

}
