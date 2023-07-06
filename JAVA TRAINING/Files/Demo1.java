import java.util.*;
import java.io.*;
class Demo1
{
	public static void main(String args[])
	{	
		try
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter ID ? ");
			int  id = Integer.parseInt(br.readLine());

			System.out.println("Enter FIRST NAME ? ");
			String fname = br.readLine();
			
			System.out.println("Enter LAST  NAME ? ");
			String lname = br.readLine();

			System.out.println("ID is : "+id);
			System.out.println("First Name is : "+fname);
			System.out.println("Last Name is : "+lname);
		}
		catch(Exception e )
		{
		}
	}
}