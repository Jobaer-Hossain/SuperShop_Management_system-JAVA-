package Product;
public class Fashion extends Product
{
	String size;
	public  Fashion()
	{
	}
	public void fashion(String pName,double price,String category,int availavleQuantity,int pId,String size)
	{
		super.product(pName,price,availavleQuantity,category,pId);
		this.size=size;
	}
	public void setSize(String size)
	{
		this.size=size;
	}
	public String getsize()
	{
		return size;
	}
	
	public void show()
	{
		super.pShow();
		System.out.println("Size of "+pName+" :"+size);
		
	}
}