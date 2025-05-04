package Product;
import java.util.*;
public class Product
{
	
	public final int deliveryCharge=40;
	public int pNo;
	public double availavleQuantity;
	public double quantity;
	public String pName;
	public String category;
	public double price;
	public int pId;
	public static double total;
	public Product()
	{
	}
	
	public Product(String pName,double price,double availavleQuantity,String category,int pId)
	{
		this.pName=pName;
		this.price=price;
		this.category=category;
		this.pId=pId;
	}
	public void setName(String pName)
	{
		this.pName=pName;
	}
	public String getName()
	{
		return pName;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setAvaiavleQuantity(double availavleQuantity)
	{
		this.availavleQuantity=availavleQuantity;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public void setPID(int pId)
	{
		this.pId=pId;
	}
	public double getPrice()
	{
		return price;
	}
	public double getAvailavleQuantity()
	{
		return availavleQuantity;
	}
	public String getCategory()
	{
		return category;
	}
	
	public int getPID()
	{
		return pId;
	}
	public void product(String pName,double price,double availavleQuantity,String category,int pId)
	{
		this.pName=pName;
		this.price=price;
		this.availavleQuantity=availavleQuantity;
		this.category=category;
		this.pId=pId;
	}
	public void buy()
	{
		Scanner sin=new Scanner(System.in);
		System.out.print("	Enter Buying Quantity: ");
		try
		{
		quantity=sin.nextDouble();
		}
		catch(InputMismatchException m)
		{
			System.out.println("	Exception: "+m);											//exception
			System.out.println("	Please Input Integer Number");
		}
		if(quantity>0 && quantity<=availavleQuantity)
		{
		System.out.println("	Total Amount: "+price+" Taka");
		price=price*quantity;
		System.out.println("	Delivery charge: "+deliveryCharge+" Taka");
		System.out.println("	Total Payable Amount with Delivery charge: "+(price+deliveryCharge)+" Taka");
		System.out.println("	Total amount: "+(total+price));
		}
		else
		{
			System.out.println("	The Products is Out of Stock");
		}
	}
	
		
	public void show()
	{
		System.out.println("	Product Category: "+category);
		System.out.println("	Product Name: "+pName);
		System.out.println("	Product Price: "+price+" Taka");
		System.out.println("	Availavle Quantity: "+availavleQuantity+" KG");
	}
	public void pShow()
	{
		System.out.println("	Product Category: "+category);
		System.out.println("	Product Name: "+pName);
		System.out.println("	Product Price: "+price+" Taka");
		System.out.println("	Quantity: "+availavleQuantity+" piece");
	}
	public void lShow()
	{
		System.out.println("	Product Category: "+category);
		System.out.println("	Product Name: "+pName);
		System.out.println("	Product Price: "+price+" Taka");
		System.out.println("	Quantity: "+availavleQuantity+" Liter");
	}
}