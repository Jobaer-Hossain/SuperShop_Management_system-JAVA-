package SuperShop;
import Person.*;
import Interfaces.*;
import Product.*;
import java.util.Scanner;
public class Supershop implements EmployeeOperation,CustomerOperation,ProductOperation
{
	private Customer [] customer;
	private Employee [] employee;
	private Product[] p;
	
	
	int totalCount;
	int totalCountC;
	int totalCountE;
	int availavleQuantity;
	String name;
	int size;
	int size1;
	int size3;
	
	
	public Supershop(String name,int size,int size1,int size3)
	{
		this.name=name;
		customer=new Customer[size];
		employee=new Employee[size1];
		p=new Product[size3];
		
	}
	public void addCustomer(Customer c)
	{
		if(totalCountC<customer.length)
		{
			customer[totalCountC]=c;
			totalCountC++;
			System.out.println("	This Customer added successfully");
			c.show();
		}
		else
		{
			System.out.println("	Failed! Not added");
		}
	}
	public void removeCustomer(Customer c)
	{
		for(int i=0;i<totalCountC;i++)
		{
			if (customer[i]==c)
			{
				
				
				customer[i]=customer[--totalCountC];
				c.show();
				System.out.println("	This Customer removed successfully");
				System.out.println("");
			}
			else
			{
				System.out.println("	Failed! Not removed");
			}
		}
	}
	
	public void showCustomer()
	{
		
		for(int i=0;i<totalCountC;i++)
		{
			if(customer[i]!=null)
			{
				System.out.println("	Name of Supershop: "+name);
				customer[i].show();
				System.out.println("	Total Customer: "+totalCountC);
			}
		}
	}
	public void addEmployee(Employee e)
	{
		if(totalCountE<employee.length)
		{
			employee[totalCountE]=e;
			totalCountE++;
			System.out.println("	This Employee added successfully");
			e.show();
		}
		else
		{
			System.out.println("	Failed! Not added");
		}
	}
	public void removeEmployee(Employee e)
	{
		for(int i=0;i<totalCountE;i++)
		{
			if (employee[i]==e)
			{
				
				System.out.println("	This Employee removed successfully");
				employee[i]=employee[--totalCountE];
				e.show();
				System.out.println("");
			}
			else
			{
				System.out.println("	Failed! Not removed");
			}
		}
	}
	
	public void showEmployee()
	{
		
		for(int i=0;i<totalCountE;i++)
		{
			if(employee[i]!=null)
			{
			System.out.println("	Name of Supershop: "+name);
				employee[i].show();
			System.out.println("	Total Employee: "+totalCountE);
			}
		}
	}
	public void addProduct(Product ob)
	{
		if(totalCount<p.length)
		{
			p[totalCount]=ob;
			availavleQuantity++;
			totalCount++;
			System.out.println("	This Product Added successfully");
		}
		else
		{
			System.out.println("	Storage full");
		}
	}
	public void removeProduct(Product ob)
	{
		for(int i=0;i<totalCount;i++)
		{
			if(p[i]==ob)
			{
				p[i] = null;
				System.out.println("	Removed");
			}
			else
			{
				System.out.println("	Not Removed");
			}
		}
	}
	public Product searchProduct(int pId)
	{
		Product pd=null;
		int flag = 0;
		for(int i=0;i<p.length;i++)
		{
			if(p[i]!=null)
			{
				if(p[i].getPID()==pId)
				{
					pd=p[i];
					flag=1;
					break;
				}
			}
		}
	    if(flag==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		return pd;
	}
	public void showProduct()
	{
		System.out.println("");
	
		
		for(int i=0;i<totalCount;i++)
		{
			if(p[i]!=null)
			{
				System.out.println("	Name: "+name);
				p[i].pShow();
			}	
		}
	}
	
}