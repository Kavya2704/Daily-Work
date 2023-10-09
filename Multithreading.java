package create;

class Warrior extends Thread
{
	String res1="bramhasttra";
	String res2="pashupatastra";
	String res3="sarpastra";
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		if(name.equals("ARJUNA"))
		{
			arjuna();
		}
		else
		{
			karna();
		}
	}
	
	public void arjuna()
	{
		try 
		{
			Thread.sleep(3000);
			synchronized(res3)
			{
				System.out.println("Arjuna acquired bramhastra");
				Thread.sleep(3000);
				synchronized(res2)
				{
					System.out.println("Arjuna acquired pashupatastra");
					Thread.sleep(3000);
				    synchronized(res1)
					{
						System.out.println("Arjuna acquired sarpastra");
						
					}
				}
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Handeled");
		}
	}
	
	public void karna()
	{
		try 
		{
			Thread.sleep(3000);
			synchronized(res1)
			{
				System.out.println("Karna acquired bramhastra");
				Thread.sleep(3000);
				synchronized(res2)
				{
					System.out.println("Karna acquired pashupatastra");
					Thread.sleep(3000);
				    synchronized(res3)
					{
						System.out.println("Karna acquired sarpastra");
						
					}
				}
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Handeled");
		}
	}
}
public class Demo7 {

	public static void main(String[] args) {
		Warrior w1=new Warrior();
		Warrior w2=new Warrior();	
		
		w1.setName("ARJUNA");
		w2.setName("KARNA");
		
		w1.start();
		w2.start();
	}
}

	