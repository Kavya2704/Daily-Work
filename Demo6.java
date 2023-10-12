package create;

class Bathroom extends Thread
{
	@Override
	   synchronized public void run() {
		try
		{
			System.out.println(Thread.currentThread().getName()+ "is executong stmt1");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+ "is executong stmt2");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+ "is executong stmt3");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+ "is executong stmt4");
			Thread.sleep(3000);
			
			synchronized(this)
			{
				System.out.println(Thread.currentThread().getName()+ "is executong stmt5");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+ "is executong stmt6");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+ "is executong stmt7");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+ "is executong stmt8");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Problem");
		}
	}
}


public class Demo6 {

	public static void main(String[] args) {
		 Bathroom ba=new Bathroom();
		 
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
