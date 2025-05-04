package Person;
public abstract class Person
{
	public String name;
	public String contactNumber;
	public int age;
	public Person()
	{
	}
	public Person(String name, String contactNumber,int age)
	{
		this.name=name;
		this.contactNumber=contactNumber;
		this.age=age;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber=contactNumber;
	}
	public String getContactNumber()
	{
		return contactNumber;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public int age()
	{
		return age;
	}
	public abstract void show();
}