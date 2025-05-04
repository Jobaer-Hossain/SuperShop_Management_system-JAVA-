package Person;
public class Employee extends Person
{
	private double salary;
	private String id;
	public Employee()
	{
	}
	public Employee(String name, String contactNumber,int age,String id, double salary)
	{
		super(name,contactNumber,age);
		this.id=id;
		this.salary=salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}
	public void show()
	{
		System.out.println("	\n	Name: "+name);
		System.out.println("	Age: "+age);
		System.out.println("	Contact Number: "+contactNumber);
		System.out.println("	Employee ID: "+id);
		System.out.println("	Employee salary: "+salary);	
	}
}