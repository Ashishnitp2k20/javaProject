import java.io.*;
import java.util.*;
public class a6q4
{
	public static void main(String args[])throws IOException,FileNotFoundException
	{
		String cname="";
		int i;

		FileReader fr=new FileReader("FIRSTNAME.txt");
		while((i=fr.read())!=-1)
			cname+=(char)i;
		fr.close();
		
		FileReader fr2=new FileReader("MIDDLENAME.txt");
		while((i=fr2.read())!=-1)
			cname+=(char)i;
		fr2.close();

		
		FileReader fr3=new FileReader("LASTNAME.txt");
		while((i=fr3.read())!=-1)
			cname+=(char)i;
		fr3.close();
		
		FileWriter fw=new FileWriter("COMPLETENAME.txt");
		fw.write(cname);
		fw.close();
	}
}





