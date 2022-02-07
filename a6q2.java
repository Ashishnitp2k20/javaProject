import java.io.*;
class Book implements Serializable
{
	int id;
	transient int price;
	String name,author;
	public Book(int id,String name,int price,String author)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.author=author;
	}
}

public class a6q2
{
	public static void main(String args[])throws Exception
	{
		Book b=new Book(12,"HarryPotter",1000,"J.KRowling");
		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("out.txt"));
		obj.writeObject(b);
		obj.flush();
		obj.close();
		System.out.println("State Saved Sucessfully !");
	}
}
