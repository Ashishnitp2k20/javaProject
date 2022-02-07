import java.io.*;
import java.util.*;
class RandomException extends Exception
{
	public String toString()
	{
		return "geta an random exception.";
	}
}
public class a6q1
{
	static void a()throws RandomException 
	{
		System.out.println("Inside a()");
		throw new RandomException();
	}
	public static void main(String args[])
	{
		try{
			a();
		}
		catch(RandomException e)
		{
			System.out.println("Inside main()");
			System.out.println(e);
		}
	}
}

