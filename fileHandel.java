import java.io.*;

class Main
{
	public static void main(String args[])
	{
		try 
		{
			FileInputStream f = new FileInputStream("a1.txt");
			BufferedInputStream b = new BufferedInputStream(f);

			int ch;
			
			do 
			{
				ch = b.read();
				
				if(ch>=0)
					System.out.println((char)ch);
			}
			while(ch>=0);
			
			b.close();
		}	
			
			catch(FileNotFoundException e)
			{
				System.out.println("File Not Found");
			}
			catch(IOException e)
			{
				System.out.println("IO Exception is generated");
			}
	}

}
