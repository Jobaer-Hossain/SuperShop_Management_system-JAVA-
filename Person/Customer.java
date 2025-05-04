package Person;
import java.lang.*;

public class Customer extends Person
{
	private String address;
	int cId;

	public Customer()
	{
		
	}
	public Customer(String name, String contactNumber,int age,String address,int cId)
	{
		super(name,contactNumber,age);
		this.address=address;
		this.cId=cId;
	}
	public void setCID(int cId)
	{
		this.cId=cId;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return address;
	}
	public int getCID()
	{
		return cId;
	}
	
	
	public void show()
	{
		System.out.println("	\n	Name: "+name);
		System.out.println("	Age: "+age);
		System.out.println("	Contact Number: "+contactNumber);
		System.out.println("	Address: "+address);
		
	}
}