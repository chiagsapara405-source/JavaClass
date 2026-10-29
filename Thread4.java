class Demo implements Runnable
{
	public void run()
	{
		for(int i = 1; i <= 3; i++)
		{
			System.out.println("Thread is " + i);
		}
		System.out.println("End of thread");
	}
}

class Main
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		Thread t = new Thread(d);
		t.start();
	}
}
