package Person;
//here we are not having our tostring method
//so there will be output Person.Details@36baf30c
/*
public class Details {
       String name;
       int roll;
       
	public Details(String name,int roll) {
		this.name=name;
		this.roll=roll;
		
	}

	public static void main(String[] args) {
	Details d=new Details("Ashish",2006061);
	System.out.println(d);
	}

}
*/

//Here we are using toString method
//By using toString method we can initial the values of an object to a reference variable of that class
public class Details {
    String name;
    int roll;
    
	public Details(String name,int roll) {
		this.name=name;
		this.roll=roll;
		
	}
    public String toString() {
    	return "Name : "+name+" Roll no: "+roll;
    }
	public static void main(String[] args) {
	Details d=new Details("Ashish",2006061);
	Details d1=new Details("sridhar",2006062);
	System.out.println(d);
	System.out.println(d1);
	}

}

// No matter how many object's value to be pass to an variable