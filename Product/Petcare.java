package Product;
public class Petcare  extends Product
{
	public double weight;
	public  Petcare()
	{
	}
	public Petcare(String name,double price,double availavleQuantity,String category,int pId)
	{
		super.product(pName,price,availavleQuantity,category,pId);
	}
	public void  pet(String name,double price,double availavleQuantity,String category,int pId,double weight)
	{
		super.product(name,price,availavleQuantity,category,pId);
		this.weight=weight;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	public double getWeight()
	{
		return weight;
	}
	public void show()
	{
		System.out.println("Size of Packet: "+weight+ "KG");
		super.pShow();
	}
}