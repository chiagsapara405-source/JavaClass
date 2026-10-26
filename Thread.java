class Main
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		
		System.out.println("The Current Thread Is "+t);
		System.out.println("Name Of The Thread Is "+t.getName());
	
		t.setName("My Thread");
		System.out.println("Now The Name Of The Thread Is "+t.getName());
	}
}
