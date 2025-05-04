package Product;

public class Cosmetics extends Product

{
	String bName;	
	public  Cosmetics()
	{
	}
	public Cosmetics(String pName,double price,int availavleQuantity,String category,int pId,String bName)
	{
		super.product(pName,price,availavleQuantity,category,pId);
		this.bName=bName;
	}
	public void  makeup(String pName,double price,int availavleQuantity,String category,int pId,String bName)
	{
		super.product(pName,price,availavleQuantity,category,pId);
		this.bName=bName;
	}
	public void setBName(String bName)
	{
		this.bName=bName;
	}
	public String getBName()
	{
		return bName;
	}
	public void pShow()
	{
		super.pShow();
		System.out.println("	Name of Brand :"+bName);
	}
}