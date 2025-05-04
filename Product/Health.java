package Product;
public class Health extends Product
{
	int medicineNum;
	public  Health()
	{
		
		
	}
	public Health(String pName,double price,double availavleQuantity,String category,int pId,int medicineNum)
	{
		super.product(pName,price,availavleQuantity,category,pId);
		this.medicineNum=medicineNum;
		
	}
	
	public void medicine(String name,double price,double availavleQuantity,String category,int pId,int medicineNum)
	{
		super.product(pName,price,availavleQuantity,category,pId);
		this.medicineNum=medicineNum;
		
	}
	public void setMedicineNum(int medicineNum)
	{
		this.medicineNum=medicineNum;
	}
	public int getMedicineNum()
	{
		return medicineNum;
	}
	
	public void show()
	{
		super.show();
		System.out.println("Number of Medicine in a Packet: "+medicineNum);
	}
}