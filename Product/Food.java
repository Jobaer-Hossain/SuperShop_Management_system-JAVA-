package Product;
public class Food extends Product
{
	String makingPlace;
	double weight;
	public  Food()
	{
	}
	public void food(String pName,double price,double availavleQuantity,String category,int pId,String makingPlace)
	{
		super.product(pName,price,availavleQuantity,category,pId);
		this.makingPlace=makingPlace;
	}
	
	
	public void meat(String pName,double price,double availavleQuantity,String category,int pId,double weight)
	{
		super.product(pName,price,availavleQuantity,category,pId);
		this.weight=weight;
	}
	public void setMakingPlace(String makingPlace)
	{
		this.makingPlace=makingPlace;
	}
	public String getMakingPlace()
	{
		return makingPlace;
	}
	public void showMeat()
	{
		System.out.println("	Size of Packet: "+weight+ "KG");
		super.pShow();
	}
	public void show()
	{
		System.out.println("	Cultivated or Made From: "+makingPlace);
		super.show();
	}
}