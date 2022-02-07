import java.io.*;
import java.util.*;
class FlatTyre extends Exception
{
	public String toString()
	{
		return "Stephany to the rescue!...Repaired";
	}
}
public class a6q3
{
	static void drive(boolean stephPresent)throws FlatTyre
	{
		if(stephPresent)
		{
			throw new FlatTyre();
		}
		else
		{
			System.out.println("Journey Terminated !");
		        return;
		}
	}
	public static void main(String args[])
	{
		try
		{
			drive(false);
		}
		catch(FlatTyre e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("BYE!");
		}
	}
}


