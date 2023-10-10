package create;

class Queue
{
	 private int data;
	 boolean dataIsPresent=false;
	 
	synchronized public void producer(int data)
	 {
		if(dataIsPresent==false)
		{
			 this.data=data;
			 System.out.println("producer produced the value" +data);
			 dataIsPresent=true;
			 notify();
		}
		else
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	 }
	synchronized public void consumerr()
	 {
		 if(dataIsPresent==true)
		 {
			 System.out.println("consumer produced the value" +data);
			 dataIsPresent=false;
			 notify();
		 }
		 else
		 {
			 try
			 {
				 wait();
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
	 }
}

class producer extends Thread
{
	Queue q;
	producer(Queue q)
	{
		this.q=q;
	}
	@Override
	public void run() {
		int i=0;
		for(; ;)
		{
			q.producer(i++);
		}
		
	}
}

class consumer extends Thread
{
	Queue q;
	consumer(Queue q)
	{
		this.q=q;
	}
	@Override
	public void run() {
		for(; ;)
		{
			q.consumerr();
		}
		
	}
}

public class Demo8 {

	public static void main(String[] args) {
		Queue q=new Queue();
		producer p=new producer(q);
		consumer c=new consumer(q);
		
		p.setName("producer");
		c.setName("consumer");
		
		p.start();
		c.start();

	}

}
